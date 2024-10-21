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
fun StorePage9(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier = modifier
            .requiredWidth(width = 393.dp)
            .requiredHeight(height = 808.dp)
            .background(color = Color(0xfff8fae5))
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 57.dp,
                    y = 115.dp)
                .requiredWidth(width = 280.dp)
                .requiredHeight(height = 500.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xff76453b)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 67.dp,
                    y = 130.dp)
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 450.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color.White))
        Button(
            onClick = { },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 77.dp,
                    y = 160.dp)
                .requiredWidth(width = 240.dp)
                .requiredHeight(height = 40.dp)){ }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 77.dp,
                    y = 225.dp)
                .requiredWidth(width = 240.dp)
                .requiredHeight(height = 100.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 77.dp,
                    y = 352.dp)
                .requiredWidth(width = 240.dp)
                .requiredHeight(height = 100.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470)))
        Button(
            onClick = { navController.navigate("MainPage3") },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 257.dp,
                    y = 642.dp)
                .requiredWidth(width = 80.dp)
                .requiredHeight(height = 50.dp)){ }
        Text(
            text = "Category : Home stuff",
            color = Color.White,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 97.dp,
                    y = 160.dp)
                .requiredWidth(width = 240.dp)
                .requiredHeight(height = 40.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Fridge",
            color = Color.White,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 97.dp,
                    y = 225.dp)
                .requiredWidth(width = 240.dp)
                .requiredHeight(height = 40.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Pan",
            color = Color.White,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 97.dp,
                    y = 356.dp)
                .requiredWidth(width = 240.dp)
                .requiredHeight(height = 40.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Save",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 257.dp,
                    y = 652.dp)
                .requiredWidth(width = 80.dp)
                .requiredHeight(height = 30.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 77.dp,
                    y = 225.dp)
                .requiredWidth(width = 240.dp)
                .requiredHeight(height = 180.dp)
                .clip(shape = RoundedCornerShape(20.dp)))
        Text(
            text = "Cost :",
            color = Color.White,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 97.dp,
                    y = 439.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 40.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        IconButton(
            onClick = { },
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 270.dp,
                    y = 255.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 24.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add),
                    contentDescription = "Vector",
                    modifier = Modifier
                        .fillMaxSize())
            }
        }
        IconButton(
            onClick = { },
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 270.dp,
                    y = 380.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 24.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add),
                    contentDescription = "Vector",
                    modifier = Modifier
                        .fillMaxSize())
            }
        }
        IconButton(
            onClick = { },
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 278.dp,
                    y = 532.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 30.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.shoppingcart),
                    contentDescription = "Vector",
                    modifier = Modifier
                        .fillMaxSize())
            }
        }
        Button(
            onClick = {navController.navigateUp()},
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 57.dp,
                    y = 700.dp)
                .requiredWidth(width = 60.dp)
                .requiredHeight(height = 40.dp)){ }
        Image(
            painter = painterResource(id = R.drawable.back),
            contentDescription = "back",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 62.dp,
                    y = 700.dp)
                .requiredWidth(width = 50.dp)
                .requiredHeight(height = 40.dp))
        Image(
            painter = painterResource(id = R.drawable.pan),
            contentDescription = "Pan",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 160.dp,
                    y = 365.dp)
                .requiredSize(size = 75.dp))
        Image(
            painter = painterResource(id = R.drawable.fridge),
            contentDescription = "fridge",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 160.dp,
                    y = 242.dp)
                .requiredWidth(width = 75.dp)
                .requiredHeight(height = 65.dp))
    }
}

@Preview(widthDp = 393, heightDp = 808)
@Composable
private fun StorePage9Preview() {
    StorePage9(Modifier, rememberNavController())
}