package com.example.homerenovationplannerapp.ui.theme

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
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
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.homerenovationplannerapp.R

@Composable
fun PlansScreen7(modifier: Modifier = Modifier, navController: NavController) {
    val viewModel: PlansViewModel = viewModel()
    val plans by viewModel.plans

    Log.d("PlansScreen7", "Plans loaded: $plans")

    Box(
        modifier = modifier
            .requiredWidth(393.dp)
            .requiredHeight(808.dp)
            .background(color = Color(0xfff8fae5))
    ) {
        Column(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 10.dp, y = 100.dp)
                .fillMaxWidth()
        ) {
            plans.forEach { plan ->
                Box(
                    modifier = Modifier
                        .padding(vertical = 4.dp)
                        .clip(shape = RoundedCornerShape(20.dp))
                        .background(color = Color(0xffb19470))
                        .requiredWidth(373.dp)
                        .requiredHeight(80.dp)
                        .padding(8.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = plan.PlanTitle,
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier
                                .fillMaxWidth()
                        )

                        Button(
                            onClick = { navController.navigate("PlanDetailsScreen8/${plan.PlanID}") },
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
                            modifier = Modifier
                                .align(alignment = Alignment.CenterHorizontally)
                                .padding(top = 8.dp)
                                .size(width = 60.dp, height = 40.dp) // Adjust size to fit the text
                        ) {
                            Text(
                                text = "...", // Your button text here
                                color = Color.White, // Text color
                                fontSize = 12.sp, // Increase text size for visibility
                                modifier = Modifier
                                    .align(Alignment.CenterVertically) // Align text vertically center
                            )
                        }
                    }
                }
            }
        }
        Button(
            onClick = { navController.navigate("MainPage3") },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 67.dp, y = 700.dp)
                .requiredWidth(width = 60.dp)
                .requiredHeight(height = 40.dp)
        ) {

        }
        Image(
            painter = painterResource(id = R.drawable.back),
            contentDescription = "back",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 72.dp, y = 700.dp)
                .requiredWidth(width = 50.dp)
                .requiredHeight(height = 40.dp)
        )
    }
}

@Preview(widthDp = 393, heightDp = 808)
@Composable
private fun PlansScreen7Preview() {
    PlansScreen7(Modifier, rememberNavController())
}