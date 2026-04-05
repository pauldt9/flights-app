package com.example.airportapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.airportapp.R

@Composable
fun SplashScreen(navController: NavController){
    Box(
        modifier = Modifier.fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF002151),
                        Color(0xFF091736)
                    )
                )
            )
    ) {
        Text(
            stringResource(R.string.app_title),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 75.dp),
            fontFamily = FontFamily(Font(R.font.krona_one)),
            fontWeight = FontWeight(400),
            color = Color(0xFF2356A1)
        )

        Text(
            text = "Lorem ipsum dolor sit amet consectetur adipiscing " +
                    "\nelit sagittis vehicula nascetur, conubia.",
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 45.dp),
            fontSize = 12.sp,
            fontWeight = FontWeight(400),
            lineHeight = 12.sp,
            color = Color(0xFFD2D2D2),
            textAlign = TextAlign.Center
        )
    }
}