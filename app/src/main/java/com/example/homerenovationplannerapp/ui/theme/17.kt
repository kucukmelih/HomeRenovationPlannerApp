package com.example.homerenovationplannerapp.ui.theme

import androidx.compose.foundation.Image
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
fun Search4317(details3: String?, navController: NavController) {
    Box(
        modifier = Modifier
            .requiredWidth(393.dp)
            .requiredHeight(808.dp)
            .background(color = Color(0xfff8fae5))
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 67.dp, y = 72.dp)
                .requiredWidth(260.dp)
                .requiredHeight(50.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xff76453b))
        )
        Text(
            text = "Planning",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 82.dp, y = 72.dp)
                .requiredWidth(230.dp)
                .requiredHeight(50.dp)
                .wrapContentHeight(Alignment.CenterVertically)
        )
        Divider(
            color = Color(0xffb19470),
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 0.dp, y = 150.dp)
                .requiredWidth(393.dp)
        )
        Button(
            onClick = { navController.navigate("HelpCenter5")},
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffb19470)),
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 67.dp, y = 172.dp)
                .requiredWidth(260.dp)
                .requiredHeight(60.dp)
        ) {}
        Button(
            onClick = { navController.navigate("Details3Screen/$details3") },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffb19470)),
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 67.dp, y = 244.dp)
                .requiredWidth(260.dp)
                .requiredHeight(60.dp)
        ) {
            Text(
                text = "",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .requiredWidth(260.dp)
                    .requiredHeight(50.dp)
                    .wrapContentHeight(Alignment.CenterVertically)
            )
        }
        Text(
            text = "Consult an expert",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 67.dp, y = 172.dp)
                .requiredWidth(260.dp)
                .requiredHeight(50.dp)
                .wrapContentHeight(Alignment.CenterVertically)
        )
        Text(
            text = "Use ready plan",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 67.dp, y = 244.dp)
                .requiredWidth(260.dp)
                .requiredHeight(50.dp)
                .wrapContentHeight(Alignment.CenterVertically)
        )

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
private fun Search4317Preview() {
    Search4317(details3 = "Sample details3", navController = rememberNavController())
}
