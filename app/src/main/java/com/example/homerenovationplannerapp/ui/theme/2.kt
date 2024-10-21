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
import androidx.compose.ui.draw.rotate
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
fun RegisterPage2(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier = modifier
            .requiredWidth(width = 393.dp)
            .requiredHeight(height = 808.dp)
            .background(color = Color(0xfff8fae5))
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 67.dp,
                    y = 301.dp)
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 50.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 67.dp,
                    y = 231.dp)
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 50.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 67.dp,
                    y = 371.dp)
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 50.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 67.dp,
                    y = 441.dp)
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 50.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470)))
        Text(
            text = "E-mail",
            color = Color.White,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 87.dp,
                    y = 301.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Name",
            color = Color.White,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 92.dp,
                    y = 231.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Password",
            color = Color.White,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 87.dp,
                    y = 441.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Phone",
            color = Color.White,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 157.dp,
                    y = 371.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "+90",
            color = Color.White,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 87.dp,
                    y = 371.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Divider(
            color = Color(0xff76453b),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 100.dp,
                    y = 395.dp)
                .requiredWidth(width = 50.dp)
                .rotate(degrees = -90f))
        Button(
            onClick = { navController.navigate("MainPage3")},
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 117.dp,
                    y = 651.dp)
                .requiredWidth(width = 160.dp)
                .requiredHeight(height = 50.dp)){ }
        Text(
            text = "Register",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 117.dp,
                    y = 651.dp)
                .requiredWidth(width = 160.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
    }
}

@Preview(widthDp = 393, heightDp = 808)
@Composable
private fun RegisterPage2Preview() {
    RegisterPage2(Modifier, rememberNavController())
}