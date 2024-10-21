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
import androidx.compose.material3.Icon
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
fun ShoppingCart11(modifier: Modifier = Modifier, navController: NavController) {
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
                    y = 153.dp)
                .requiredWidth(width = 300.dp)
                .requiredHeight(height = 64.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 47.dp,
                    y = 259.dp)
                .requiredWidth(width = 300.dp)
                .requiredHeight(height = 63.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 47.dp,
                    y = 364.dp)
                .requiredWidth(width = 300.dp)
                .requiredHeight(height = 64.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470)))
        Button(
            onClick = { },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 209.dp,
                    y = 590.dp)
                .requiredWidth(width = 138.dp)
                .requiredHeight(height = 64.dp)){ }
        Text(
            text = "1 x Fridge",
            color = Color.White,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 82.dp,
                    y = 259.dp)
                .requiredWidth(width = 265.dp)
                .requiredHeight(height = 63.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "6 x Wall Paint",
            color = Color.White,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 82.dp,
                    y = 153.dp)
                .requiredWidth(width = 265.dp)
                .requiredHeight(height = 64.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "90 x Marble",
            color = Color.White,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 82.dp,
                    y = 364.dp)
                .requiredWidth(width = 265.dp)
                .requiredHeight(height = 64.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Total : 574 $",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 209.dp,
                    y = 590.dp)
                .requiredWidth(width = 138.dp)
                .requiredHeight(height = 64.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        IconButton(
            onClick = { },
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 255.dp,
                    y = 266.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 30.dp)
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
                .offset(x = 255.dp,
                    y = 162.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 30.dp)
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
                .offset(x = 255.dp,
                    y = 372.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 30.dp)
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
                .offset(x = 295.dp,
                    y = 162.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 30.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.delete),
                    contentDescription = "Vector",
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xff76453b)))
            }
        }
        IconButton(
            onClick = { },
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 295.dp,
                    y = 372.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 30.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.delete),
                    contentDescription = "Vector",
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xff76453b)))
            }
        }
        IconButton(
            onClick = { },
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 295.dp,
                    y = 266.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 30.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.delete),
                    contentDescription = "Vector",
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xff76453b)))
            }
        }
        Button(
            onClick = { navController.navigate("StorePage9")  },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 47.dp,
                    y = 700.dp)
                .requiredWidth(width = 60.dp)
                .requiredHeight(height = 40.dp)){ }
        Image(
            painter = painterResource(id = R.drawable.back),
            contentDescription = "back",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 52.dp,
                    y = 700.dp)
                .requiredWidth(width = 50.dp)
                .requiredHeight(height = 40.dp))
    }
}

@Preview(widthDp = 393, heightDp = 808)
@Composable
private fun ShoppingCart11Preview() {
    ShoppingCart11(Modifier, rememberNavController())
}