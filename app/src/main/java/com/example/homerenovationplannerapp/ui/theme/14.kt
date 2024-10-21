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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
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
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.homerenovationplannerapp.R

@Composable
fun Search314(detailedCategoryID: Int?, navController: NavController) {
    val viewModel: CategoriesViewModel.DetailedCategoryViewModel = viewModel(
        factory = CategoriesViewModel.DetailedCategoryViewModelFactory(detailedCategoryID ?: 0)
    )
    val detailedCategory by viewModel.detailedCategory.collectAsState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xfff8fae5))
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 72.dp)
                .background(Color(0xff76453b), shape = RoundedCornerShape(20.dp))
                .height(60.dp)  // Yükseklik ayarlandı
                .width(350.dp)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Text(
                text = detailedCategory?.DetailedCategoryName ?: "Loading...",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold  // Kalın yapıldı
                ),
                modifier = Modifier.align(Alignment.Center)
            )
        }

        Divider(
            color = Color(0xffb19470),
            modifier = Modifier
                .padding(top = 150.dp)
                .fillMaxWidth()
        )

        detailedCategory?.Details?.forEachIndexed { index, detail ->
            Box(
                modifier = Modifier
                    .padding(top = 165.dp + (index * 100).dp, start = 72.dp, end = 72.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(0xffb19470))
                    .padding(40.dp)
            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(color = Color.Black, fontSize = 14.sp, fontWeight = FontWeight.Bold)) { append(" ") }
                        withStyle(style = SpanStyle(color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)) { append(detail.Info ?: "No Info") }
                    }
                )
            }
        }

        listOf(
            "Material Details" to "Search4115/${detailedCategory?.Details?.getOrNull(0)?.Details1}",
            "Worker Details" to "Search4216/${detailedCategory?.Details?.getOrNull(0)?.Details2}",
            "Plans" to "Search4317/${detailedCategory?.Details?.getOrNull(0)?.Details3}"
        ).forEachIndexed { index, pair ->
            Button(
                onClick = { navController.navigate(pair.second) },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xffb19470)),
                modifier = Modifier
                    .padding(top = 425.dp + (index * 80).dp, start = 15.dp)
                    .width(363.dp)
                    .height(70.dp)
            ) {
                Text(
                    text = pair.first,
                    fontSize = 16.sp,  // Yazı boyutu ayarlandı
                    fontWeight = FontWeight.Bold  // Kalın yapıldı
                )
            }
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
private fun Search314Preview() {
    Search314(detailedCategoryID = 1, navController = rememberNavController())
}