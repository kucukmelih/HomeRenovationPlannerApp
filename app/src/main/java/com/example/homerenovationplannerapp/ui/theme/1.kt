package com.example.homerenovationplannerapp.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun LoginPage1(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier = modifier
            .requiredWidth(width = 393.dp)
            .requiredHeight(height = 808.dp)
            .background(color = Color(0xfff8fae5))
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 66.99999999999989.dp,
                    y = 300.dp)
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 60.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470)))
        Text(
            text = "E-mail",
            color = Color.White,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 86.99999999999989.dp,
                    y = 300.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 60.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 66.99999999999989.dp,
                    y = 380.dp)
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 60.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470)))
        Text(
            text = "Password",
            color = Color.White,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 86.99999999999989.dp,
                    y = 380.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 60.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Welcome To Dream Home",
            color = Color(0xff76453b),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 86.99999999999989.dp,
                    y = 100.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 80.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Button(
            onClick = { navController.navigate("MainPage3")},
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 116.99999999999989.dp,
                    y = 650.dp)
                .requiredWidth(width = 160.dp)
                .requiredHeight(height = 50.dp)){ }
        Text(
            text = "Login",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 116.99999999999989.dp,
                    y = 650.dp)
                .requiredWidth(width = 160.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Button(
            onClick = { navController.navigate("RegisterPage2") },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffb19470)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 154.9999999999999.dp,
                    y = 461.dp)
                .requiredWidth(width = 150.dp)
                .requiredHeight(height = 25.dp)){ }
        Text(
            text = "Don’t have an account?",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 12.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 156.9999999999999.dp,
                    y = 460.dp)
                .requiredWidth(width = 150.dp)
                .requiredHeight(height = 25.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Divider(
            color = Color.White,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 164.9999999999999.dp,
                    y = 479.999999917042.dp)
                .requiredWidth(width = 130.dp))
    }
}

@Preview(widthDp = 393, heightDp = 808)
@Composable
private fun LoginPage1Preview() {
    LoginPage1(Modifier, rememberNavController())
}