package com.example.homerenovationplannerapp.ui.theme

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.homerenovationplannerapp.R

@Composable
fun Search213(modifier: Modifier = Modifier, categoryID: Int?, navController: NavController) {
    val viewModel: CategoriesViewModel = viewModel()
    val categories by viewModel.categories

    Log.d("Search213", "Categories loaded: $categories")

    val category = categories.find { it.CategoryID == categoryID }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xfff8fae5))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            if (category != null) {
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(vertical = 16.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(color = Color(0xff76453b))
                        .height(60.dp)  // Yükseklik ayarlandı
                        .width(400.dp)
                ) {
                    Text(
                        text = "Category: ${category.CategoryName}",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier
                            .align(Alignment.Center)
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                    )
                }
                Divider(
                    color = Color(0xffb19470),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp)
                )
                category.DetailedCategories.forEach { detailedCategory ->
                    Box(
                        modifier = Modifier
                            .padding(vertical = 4.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .background(color = Color(0xffb19470))
                            .fillMaxWidth()
                            .height(70.dp)
                            .padding(8.dp)
                            .clickable { navController.navigate("Search314/${detailedCategory.DetailedCategoryID}") }
                    ) {
                        Text(
                            text = detailedCategory.DetailedCategoryName,
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.CenterEnd)
                        )
                    }
                }
            } else {
                Text(
                    text = "Loading categories...",
                    color = Color.Gray,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
        }
        Button(
            onClick = { navController.navigateUp() },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 68.dp, y = 700.dp)
                .requiredWidth(60.dp)
                .requiredHeight(40.dp)
        ) {}
        Image(
            painter = painterResource(id = R.drawable.back),
            contentDescription = "back",
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 73.dp, y = 700.dp)
                .requiredWidth(50.dp)
                .requiredHeight(40.dp)
        )
    }
}

@Preview(widthDp = 393, heightDp = 808)
@Composable
private fun Search213Preview() {
    Search213(Modifier, categoryID = 1, rememberNavController())
}