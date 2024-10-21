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
fun PlanDetailsScreen8(planId: Int?, modifier: Modifier = Modifier, navController: NavController) {
    val viewModel: PlansViewModel = viewModel()
    val plans by viewModel.plans

    val plan = plans.find { it.PlanID == planId }

    if (plan != null) {
        Box(
            modifier = modifier
                .requiredWidth(width = 393.dp)
                .requiredHeight(height = 808.dp)
                .background(color = Color(0xfff8fae5))
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 67.dp, y = 130.dp)
                    .requiredWidth(width = 260.dp)
                    .requiredHeight(height = 50.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(color = Color(0xff76453b))
            )
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 67.dp, y = 383.dp)
                    .requiredWidth(width = 260.dp)
                    .requiredHeight(height = 50.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(color = Color(0xffb19470))
            )
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 67.dp, y = 460.dp)
                    .requiredWidth(width = 260.dp)
                    .requiredHeight(height = 50.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(color = Color(0xffb19470))
            )
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 67.dp, y = 196.dp)
                    .requiredWidth(width = 260.dp)
                    .requiredHeight(height = 160.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(color = Color(0xffb19470))
            )
            Text(
                text = "Plan: ${plan.PlanTitle}",
                color = Color.White,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 85.dp, y = 130.dp)
                    .requiredWidth(width = 230.dp)
                    .requiredHeight(height = 50.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically)
            )
            Text(
                text = "Cost: ${plan.Cost}",
                color = Color.White,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 85.dp, y = 383.dp)
                    .requiredWidth(width = 230.dp)
                    .requiredHeight(height = 50.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically)
            )
            Text(
                text = "Expected Deadline: ${plan.Date}",
                color = Color.White,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 85.dp, y = 460.dp)
                    .requiredWidth(width = 230.dp)
                    .requiredHeight(height = 50.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically)
            )
            Text(
                text = plan.Description,
                color = Color.White,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 85.dp, y = 207.dp)
                    .requiredWidth(width = 200.dp)
                    .requiredHeight(height = 149.dp)
            )
            Button(
                onClick = {
                    viewModel.deletePlan(planId ?: 0)
                    navController.navigate("MainPage3") // Navigate back after deletion
                },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 220.dp, y = 700.dp) // Adjust position as needed
                    .requiredWidth(width = 100.dp)
                    .requiredHeight(height = 40.dp)
            ) {
                Text(text = "Delete", color = Color.White)
            }

            Button(
                onClick = { navController.navigate("PlansScreen7") },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 67.dp, y = 700.dp)
                    .requiredWidth(width = 60.dp)
                    .requiredHeight(height = 40.dp)
            ) { }
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
}

@Preview(widthDp = 393, heightDp = 808)
@Composable
private fun PlanDetailsScreen8Preview() {
    PlanDetailsScreen8(planId = 1, navController = rememberNavController())
}
