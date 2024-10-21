package com.example.homerenovationplannerapp.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.homerenovationplannerapp.Plan
import com.example.homerenovationplannerapp.ApiClient
import com.example.homerenovationplannerapp.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddScreen6(modifier: Modifier = Modifier, navController: NavController) {
    var PlanTitle by remember { mutableStateOf("") }
    var Description by remember { mutableStateOf("") }
    var Cost by remember { mutableStateOf("") }
    var Date by remember { mutableStateOf("") }
    val coroutineScope = rememberCoroutineScope()

    fun addPlan() {
        coroutineScope.launch {
            try {
                val plan = Plan(
                    PlanTitle = PlanTitle,
                    Description = Description,
                    Cost = Cost,
                    Date = Date,
                    PlanID = null
                )
                val response = ApiClient.addPlan(plan)
                if (response.status.value == 200) {
                    withContext(Dispatchers.Main) {
                        navController.navigate("MainPage3")
                    }
                } else {
                    println("Response: ${response.status.value}")
                }
            } catch (e: Exception) {
                e.printStackTrace()
                println("Exception: ${e.message}")
            }
        }
    }

    Box(
        modifier = modifier
            .requiredWidth(width = 393.dp)
            .requiredHeight(height = 808.dp)
            .background(color = Color(0xfff8fae5))
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 57.dp, y = 115.dp)
                .requiredWidth(width = 280.dp)
                .requiredHeight(height = 500.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xff76453b))
        )
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 67.dp, y = 126.dp)
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 450.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color.White)
        )
        TextField(
            value = PlanTitle,
            onValueChange = { PlanTitle = it },
            label = { Text("Plan Title", color = Color.White) },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xff76453b),
                focusedLabelColor = Color.White,
                unfocusedLabelColor = Color.White
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 77.dp, y = 158.dp)
                .requiredWidth(width = 240.dp)
                .requiredHeight(height = 55.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xff76453b))
        )
        Button(
            onClick = {
                addPlan()
                navController.navigate("MainPage3")
            },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 257.dp, y = 642.dp)
                .requiredWidth(width = 80.dp)
                .requiredHeight(height = 50.dp)
        ) {
            Text(
                text = "Save",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .wrapContentHeight(align = Alignment.CenterVertically)
            )
        }

        TextField(
            value = Description,
            onValueChange = { Description = it },
            label = { Text("Description", color = Color(0xff76453b)) },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xffb19470),
                focusedLabelColor = Color.White,
                unfocusedLabelColor = Color.White
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 77.dp, y = 225.dp)
                .requiredWidth(width = 240.dp)
                .requiredHeight(height = 180.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470))
        )

        TextField(
            value = Cost,
            onValueChange = { Cost = it },
            label = { Text("Cost", color = Color(0xff76453b)) },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xffb19470),
                focusedLabelColor = Color.White,
                unfocusedLabelColor = Color.White
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 77.dp, y = 439.dp)
                .requiredWidth(width = 240.dp)
                .requiredHeight(height = 50.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470))
        )
        TextField(
            value = Date,
            onValueChange = { Date = it },
            label = { Text("Date: Month / Day / Year", color = Color(0xff76453b)) },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xffb19470),
                focusedLabelColor = Color.White,
                unfocusedLabelColor = Color.White
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 77.dp, y = 506.dp)
                .requiredWidth(width = 240.dp)
                .requiredHeight(height = 50.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470))
        )

        Button(
            onClick = { navController.navigate("MainPage3") },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 57.dp, y = 700.dp)
                .requiredWidth(width = 60.dp)
                .requiredHeight(height = 40.dp)
        ) { }
        Image(
            painter = painterResource(id = R.drawable.back),
            contentDescription = "back",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 62.dp, y = 700.dp)
                .requiredWidth(width = 50.dp)
                .requiredHeight(height = 40.dp)
        )
    }
}

@Preview(widthDp = 393, heightDp = 808)
@Composable
private fun AddScreen6Preview() {
    AddScreen6(Modifier, rememberNavController())
}
