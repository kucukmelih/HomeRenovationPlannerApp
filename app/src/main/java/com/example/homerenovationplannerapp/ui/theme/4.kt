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
import com.example.homerenovationplannerapp.R

@Composable
fun Settings4(modifier: Modifier = Modifier, navController: NavController) {
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
                    y = 262.dp)
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 50.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 67.dp,
                    y = 322.dp)
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 50.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 67.dp,
                    y = 382.dp)
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 50.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470)))
        Button(
            onClick = { },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffb19470)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 67.dp,
                    y = 442.dp)
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 50.dp)){ }
        Button(
            onClick = {navController.navigate("LoginPage1") },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 117.dp,
                    y = 550.dp)
                .requiredWidth(width = 160.dp)
                .requiredHeight(height = 50.dp)){ }
        Button(
            onClick = { },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 247.dp,
                    y = 272.dp)
                .requiredWidth(width = 60.dp)
                .requiredHeight(height = 30.dp)){ }
        Button(
            onClick = { },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 247.dp,
                    y = 332.dp)
                .requiredWidth(width = 60.dp)
                .requiredHeight(height = 30.dp)){ }
        Button(
            onClick = { },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 247.dp,
                    y = 392.dp)
                .requiredWidth(width = 60.dp)
                .requiredHeight(height = 30.dp)){ }
        Text(
            text = "Log Out",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 117.dp,
                    y = 550.dp)
                .requiredWidth(width = 160.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Settings",
            color = Color(0xff76453b),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 147.dp,
                    y = 60.dp)
                .requiredWidth(width = 100.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Divider(
            color = Color(0xffb19470),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 150.dp)
                .requiredWidth(width = 393.dp))
        Text(
            text = "Notifications",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 67.dp,
                    y = 262.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Language",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 80.dp,
                    y = 322.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "User Settings",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 80.dp,
                    y = 442.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Currency",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 80.dp,
                    y = 382.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "On",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 247.dp,
                    y = 272.dp)
                .requiredWidth(width = 60.dp)
                .requiredHeight(height = 30.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "EN",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 247.dp,
                    y = 332.dp)
                .requiredWidth(width = 60.dp)
                .requiredHeight(height = 30.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "$",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 247.dp,
                    y = 392.dp)
                .requiredWidth(width = 60.dp)
                .requiredHeight(height = 30.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Button(
            onClick = { navController.navigate("MainPage3") },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 67.dp,
                    y = 700.dp)
                .requiredWidth(width = 60.dp)
                .requiredHeight(height = 40.dp)){ }
        Image(
            painter = painterResource(id = R.drawable.back),
            contentDescription = "back",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 72.dp,
                    y = 700.dp)
                .requiredWidth(width = 50.dp)
                .requiredHeight(height = 40.dp))
    }
}

@Preview(widthDp = 393, heightDp = 808)
@Composable
private fun Settings4Preview() {
    Settings4(Modifier, rememberNavController())
}