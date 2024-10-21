package com.example.homerenovationplannerapp.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.homerenovationplannerapp.R

@Composable
fun Details3Screen(details3: String?, navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xfff8fae5))
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = 20.dp)
                .requiredWidth(230.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(color = Color(0xff76453b))
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Text(
                text = "Ready Plan",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }

        // Divider added between the two boxes with more space
        Divider(
            color = Color(0xffb19470),
            thickness = 2.dp,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = 80.dp)
                .padding(horizontal = 16.dp)
        )

        Box(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = 100.dp)  // Daha fazla boşluk eklemek için y değeri artırıldı
                .requiredWidth(300.dp)
                .requiredHeight(200.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(color = Color(0xffb19470))
                .padding(16.dp)
        ) {
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Black, fontSize = 16.sp, fontWeight = FontWeight.Bold)) { append(" ") }
                    withStyle(style = SpanStyle(color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)) { append(details3 ?: "No details available") }
                }
            )
        }

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
private fun Details3ScreenPreview() {
    Details3Screen(details3 = "Sample details3", navController = rememberNavController())
}