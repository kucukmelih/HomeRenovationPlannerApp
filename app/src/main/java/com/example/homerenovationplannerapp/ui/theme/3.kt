package com.example.homerenovationplannerapp.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.homerenovationplannerapp.R

@Composable
fun MainPage3(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier = modifier
            .requiredWidth(width = 393.dp)
            .requiredHeight(height = 808.dp)
            .background(color = Color(0xfff8fae5))
    ) {
        Divider(
            color = Color(0xffb19470),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-0.00067138671875).dp,
                    y = 150.dp)
                .requiredWidth(width = 393.dp))
        Button(
            onClick = {navController.navigate("AddScreen6") },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffb19470)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 66.dp,
                    y = 260.dp)
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 50.dp)){ }
        Button(
            onClick = {navController.navigate("PlansScreen7") },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffb19470)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 66.dp,
                    y = 320.dp)
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 50.dp)){ }
        Button(
            onClick = { navController.navigate("StorePage9")},
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffb19470)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 66.dp,
                    y = 440.dp)
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 50.dp)){ }
        Button(
            onClick = {navController.navigate("WorkersPage10") },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffb19470)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 66.dp,
                    y = 500.dp)
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 50.dp)){ }
        Button(
            onClick = {navController.navigate("Search112") },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffb19470)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 66.dp,
                    y = 380.dp)
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 50.dp)){ }
        Text(
            text = "Add New",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 86.dp,
                    y = 259.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Plans",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 86.dp,
                    y = 319.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Search",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 86.dp,
                    y = 379.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Store",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 82.dp,
                    y = 439.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Worker",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 83.dp,
                    y = 499.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Hello Melih",
            color = Color(0xff76453b),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 22.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 143.dp,
                    y = 60.dp)
                .requiredWidth(width = 100.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        IconButton(
            onClick = {navController.navigate("HelpCenter5") },
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 293.dp,
                    y = 61.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 50.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.help),
                    contentDescription = "Vector",
                    modifier = Modifier
                        .fillMaxSize())
            }
        }
        IconButton(
            onClick = { navController.navigate("Settings4")},
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 38.dp,
                    y = 61.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 50.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.settings),
                    contentDescription = "Group",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 4.158203125.dp,
                            y = 4.1582183837890625.dp)
                        .requiredWidth(width = 42.dp)
                        .requiredHeight(height = 42.dp))
            }
        }
    }
}

@Preview(widthDp = 393, heightDp = 808)
@Composable
private fun MainPage3Preview() {
    MainPage3(Modifier, rememberNavController())
}