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
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.graphics.ColorFilter
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
fun HelpCenter5(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier = modifier
            .requiredWidth(width = 393.dp)
            .requiredHeight(height = 808.dp)
            .background(color = Color(0xfff8fae5))
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 47.dp,
                    y = 191.dp)
                .requiredWidth(width = 300.dp)
                .requiredHeight(height = 320.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 57.dp,
                    y = 201.dp)
                .requiredWidth(width = 280.dp)
                .requiredHeight(height = 300.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color.White))
        Button(
            onClick = {navController.navigate("MainPage3") },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 160.dp,
                    y = 561.dp)
                .requiredWidth(width = 160.dp)
                .requiredHeight(height = 50.dp)){ }
        Text(
            text = "Help Center",
            color = Color(0xff76453b),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 137.dp,
                    y = 60.dp)
                .requiredWidth(width = 120.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Divider(
            color = Color(0xffb19470),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 150.dp)
                .requiredWidth(width = 393.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 68.dp,
                    y = 441.dp)
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 40.dp)
                .background(color = Color(0xffb19470)))
        Button(
            onClick = { },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 255.dp,
                    y = 446.dp)
                .requiredWidth(width = 60.dp)
                .requiredHeight(height = 30.dp)){ }
        Text(
            text = "Send",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 255.dp,
                    y = 446.dp)
                .requiredWidth(width = 60.dp)
                .requiredHeight(height = 30.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "...",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 68.dp,
                    y = 446.dp)
                .requiredWidth(width = 60.dp)
                .requiredHeight(height = 30.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 68.dp,
                    y = 212.dp)
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 50.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xff76453b)))
        Text(
            text = "Hi, How can I help you?",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 105.dp,
                    y = 212.dp)
                .requiredWidth(width = 196.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "End Chat",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 160.dp,
                    y = 561.dp)
                .requiredWidth(width = 160.dp)
                .requiredHeight(height = 50.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 75.dp,
                    y = 222.dp)
                .requiredSize(size = 30.dp)
                .clip(shape = CircleShape)
                .background(color = Color.White))
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "profile",
            colorFilter = ColorFilter.tint(Color(0xff76453b)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 75.dp,
                    y = 222.dp)
                .requiredSize(size = 30.dp))
    }
}

@Preview(widthDp = 393, heightDp = 808)
@Composable
private fun HelpCenter5Preview() {
    HelpCenter5(Modifier, rememberNavController())
}