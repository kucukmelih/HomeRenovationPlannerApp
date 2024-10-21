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
fun WorkersPage10(modifier: Modifier = Modifier, navController: NavController) {
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
                    y = 216.dp)
                .requiredWidth(width = 240.dp)
                .requiredHeight(height = 150.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 77.dp,
                    y = 383.dp)
                .requiredWidth(width = 240.dp)
                .requiredHeight(height = 150.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470)))
        Text(
            text = "Category : Painter",
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
            text = "Jack : 48738927817",
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
            text = "Martin : 71240482914",
            color = Color.White,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 97.dp,
                    y = 392.dp)
                .requiredWidth(width = 240.dp)
                .requiredHeight(height = 40.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 77.dp,
                    y = 234.dp)
                .requiredWidth(width = 240.dp)
                .requiredHeight(height = 180.dp)
                .clip(shape = RoundedCornerShape(20.dp)))
        Text(
            text = "Cost per hour : 16 $",
            color = Color.White,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 97.dp,
                    y = 418.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 40.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Cost per hour : 18 $",
            color = Color.White,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 97.dp,
                    y = 260.dp)
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 40.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Image(
            painter = painterResource(id = R.drawable.people1),
            contentDescription = "People1",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 100.dp,
                    y = 300.dp)
                .requiredSize(size = 60.dp))
        IconButton(
            onClick = { },
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 249.dp,
                    y = 478.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 24.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.message),
                    contentDescription = "Group",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 0.dp)
                        .requiredWidth(width = 24.dp)
                        .requiredHeight(height = 24.dp))
            }
        }
        IconButton(
            onClick = { },
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 253.dp,
                    y = 318.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 24.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.message),
                    contentDescription = "Group",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 0.dp)
                        .requiredWidth(width = 24.dp)
                        .requiredHeight(height = 24.dp))
            }
        }
        IconButton(
            onClick = { },
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 210.dp,
                    y = 317.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 20.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.phone),
                    contentDescription = "Vector",
                    modifier = Modifier
                        .fillMaxSize())
            }
        }
        IconButton(
            onClick = { },
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 210.dp,
                    y = 477.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 20.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.phone),
                    contentDescription = "Vector",
                    modifier = Modifier
                        .fillMaxSize())
            }
        }
        Image(
            painter = painterResource(id = R.drawable.people2),
            contentDescription = "People2",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 100.dp,
                    y = 460.dp)
                .requiredSize(size = 60.dp))
        Button(
            onClick = { navController.navigateUp() },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff76453b)),
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 68.dp, y = 700.dp)
                .requiredWidth(60.dp)
                .requiredHeight(40.dp)
        ) {}
        Image(
            painter = painterResource(id = R.drawable.back),
            contentDescription = "back",
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 73.dp, y = 700.dp)
                .requiredWidth(50.dp)
                .requiredHeight(40.dp)
        )
    }
}

@Preview(widthDp = 393, heightDp = 808)
@Composable
private fun WorkersPage10Preview() {
    WorkersPage10(Modifier, rememberNavController())
}