from flask import Flask, request, jsonify
from flask_cors import CORS
import pymysql
import logging

app = Flask(__name__)
CORS(app)

# Enable logging
logging.basicConfig(level=logging.DEBUG)

# Veritabanı bağlantısı
connection = pymysql.connect(
    host='localhost',
    user='root',
    password='',
    database='HomeRenovationPlannerApp',
    charset='utf8mb4',
    cursorclass=pymysql.cursors.DictCursor
)

@app.route('/add_data', methods=['POST'])
def add_data():
    app.logger.debug('Request JSON: %s', request.json)
    try:
        data = request.json
        plan_title = data.get('PlanTitle')
        description = data.get('Description')
        cost = data.get('Cost')
        date = data.get('Date')

        if not (plan_title and description and cost and date):
            return jsonify({'error': 'PlanTitle, Description, Cost ve Date gereklidir'}), 400

        with connection.cursor() as cursor:
            sql = "INSERT INTO Plans (PlanTitle, Description, Cost, Date) VALUES (%s, %s, %s, %s)"
            cursor.execute(sql, (plan_title, description, cost, date))
            connection.commit()

        return jsonify({'message': 'Veri başarıyla eklendi'})
    except pymysql.MySQLError as e:
        app.logger.error('MySQL Error: %s', e)
        return jsonify({'error': 'MySQL Error: {}'.format(e)}), 500
    except Exception as e:
        app.logger.error('Error: %s', str(e))
        return jsonify({'error': str(e)}), 500

@app.route('/read_data', methods=['GET'])
def read_data():
    try:
        with connection.cursor() as cursor:
            sql = "SELECT * FROM Plans"
            cursor.execute(sql)
            result = cursor.fetchall()

            # Cost alanını string'e dönüştür
            for row in result:
                row['Cost'] = str(row['Cost'])

            app.logger.debug('Returned JSON: %s', result)
            return jsonify(result)
    except pymysql.MySQLError as e:
        app.logger.error('MySQL Error: %s', e)
        return jsonify({'error': 'MySQL Error: {}'.format(e)}), 500
    except Exception as e:
        app.logger.error('Error: %s', str(e))
        return jsonify({'error': str(e)}), 500

@app.route('/read_categories', methods=['GET'])
def read_categories():
    try:
        with connection.cursor() as cursor:
            sql = """
                SELECT c.CategoryID, c.CategoryName, dc.DetailedCategoryID, dc.DetailedCategoryName, d.DetailID, d.Info, d.Details1, d.Details2, d.Details3
                FROM Categories c
                LEFT JOIN DetailedCategories dc ON c.CategoryID = dc.CategoryID
                LEFT JOIN Details d ON dc.DetailedCategoryID = d.DetailedCategoryID
            """
            cursor.execute(sql)
            result = cursor.fetchall()

            categories = {}
            for row in result:
                category_id = row['CategoryID']
                if category_id not in categories:
                    categories[category_id] = {
                        'CategoryID': row['CategoryID'],
                        'CategoryName': row['CategoryName'],
                        'DetailedCategories': []
                    }
                if row['DetailedCategoryID'] is not None:
                    detailed_category_id = row['DetailedCategoryID']
                    detailed_category = next((item for item in categories[category_id]['DetailedCategories'] if item['DetailedCategoryID'] == detailed_category_id), None)
                    if not detailed_category:
                        detailed_category = {
                            'DetailedCategoryID': detailed_category_id,
                            'DetailedCategoryName': row['DetailedCategoryName'],
                            'Details': []
                        }
                        categories[category_id]['DetailedCategories'].append(detailed_category)
                    if row['DetailID'] is not None:
                        detailed_category['Details'].append({
                            'DetailID': row['DetailID'],
                            'Info': row['Info'],
                            'Details1': row['Details1'],
                            'Details2': row['Details2'],
                            'Details3': row['Details3']
                        })

            categories_list = list(categories.values())
            app.logger.debug('Returned JSON: %s', categories_list)
            return jsonify(categories_list)
    except pymysql.MySQLError as e:
        app.logger.error('MySQL Error: %s', e)
        return jsonify({'error': 'MySQL Error: {}'.format(e)}), 500
    except Exception as e:
        app.logger.error('Error: %s', str(e))
        return jsonify({'error': str(e)}), 500

@app.route('/read_detailed_category/<int:detailed_category_id>', methods=['GET'])
def read_detailed_category(detailed_category_id):
    try:
        with connection.cursor() as cursor:
            sql = """
                SELECT dc.DetailedCategoryID, dc.DetailedCategoryName, d.DetailID, d.Info, d.Details1, d.Details2, d.Details3
                FROM DetailedCategories dc
                LEFT JOIN Details d ON dc.DetailedCategoryID = d.DetailedCategoryID
                WHERE dc.DetailedCategoryID = %s
            """
            cursor.execute(sql, (detailed_category_id,))
            result = cursor.fetchall()

            detailed_category = {
                'DetailedCategoryID': detailed_category_id,
                'DetailedCategoryName': None,
                'Details': []
            }
            for row in result:
                if detailed_category['DetailedCategoryName'] is None:
                    detailed_category['DetailedCategoryName'] = row['DetailedCategoryName']
                if row['DetailID'] is not None:
                    detailed_category['Details'].append({
                        'DetailID': row['DetailID'],
                        'Info': row['Info'],
                        'Details1': row['Details1'],
                        'Details2': row['Details2'],
                        'Details3': row['Details3']
                    })

            app.logger.debug('Returned JSON: %s', detailed_category)
            return jsonify(detailed_category)
    except pymysql.MySQLError as e:
        app.logger.error('MySQL Error: %s', e)
        return jsonify({'error': 'MySQL Error: {}'.format(e)}), 500
    except Exception as e:
        app.logger.error('Error: %s', str(e))
        return jsonify({'error': str(e)}), 500

@app.route('/read_options/<int:detail_id>', methods=['GET'])
def read_options(detail_id):
    try:
        with connection.cursor() as cursor:
            sql = "SELECT * FROM Options WHERE DetailID = %s"
            cursor.execute(sql, (detail_id,))
            result = cursor.fetchall()

            app.logger.debug('Returned JSON: %s', result)
            return jsonify(result)
    except pymysql.MySQLError as e:
        app.logger.error('MySQL Error: %s', e)
        return jsonify({'error': 'MySQL Error: {}'.format(e)}), 500
    except Exception as e:
        app.logger.error('Error: %s', str(e))
        return jsonify({'error': str(e)}), 500

@app.route('/delete_plan/<int:plan_id>', methods=['DELETE'])
def delete_plan(plan_id):
    try:
        with connection.cursor() as cursor:
            sql = "DELETE FROM Plans WHERE PlanID = %s"
            cursor.execute(sql, (plan_id,))
            connection.commit()
        return jsonify({'message': 'Plan başarıyla silindi'})
    except pymysql.MySQLError as e:
        app.logger.error('MySQL Error: %s', e)
        return jsonify({'error': 'MySQL Error: {}'.format(e)}), 500
    except Exception as e:
        app.logger.error('Error: %s', str(e))
        return jsonify({'error': str(e)}), 500

@app.route('/test_connection', methods=['GET'])
def test_connection():
    try:
        with connection.cursor() as cursor:
            cursor.execute("SELECT 1")
        return jsonify({'message': 'Connection successful'})
    except pymysql.MySQLError as e:
        app.logger.error('MySQL Error: %s', e)
        return jsonify({'error': 'MySQL Error: {}'.format(e)}), 500
    except Exception as e:
        app.logger.error('Error: %s', str(e))
        return jsonify({'error': str(e)}), 500

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5554)
