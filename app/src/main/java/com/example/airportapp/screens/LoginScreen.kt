package com.example.airportapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.airportapp.components.CustomImput
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDecoration
import com.example.airportapp.R
import com.example.airportapp.components.CustomButton

@Composable
fun LoginScreen(navController: NavController){
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
        // Card container
        Column(
            modifier = Modifier
                .fillMaxWidth(0.85f)
                .align(Alignment.Center)
                .wrapContentHeight()
                .shadow(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(15.dp)
                )
                .background(
                    Color(0xFFE3E3E3),
                    shape = RoundedCornerShape(15.dp)
                )
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Bienvenido\n a bordo",
                fontSize = 32.sp,
                fontWeight = FontWeight.ExtraBold,
                lineHeight = 32.sp,
                color = Color(0xFF2356A1),
                textAlign = TextAlign.Center,
            )

            var email by remember { mutableStateOf("") }
            var password by remember { mutableStateOf("") }

            CustomImput(
                "Correo",
                email,
                "fedep@gmail.com",
                {email = it},
                false
            )

            Spacer(modifier = Modifier.height(5.dp))

            CustomImput(
                "Contraseña",
                password,
                "**********",
                {password = it},
                true
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Recuperar contraseña",
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal,
                lineHeight = 15.sp,
                color = Color(0xFF00255B),
                textDecoration = TextDecoration.Underline,
                textAlign = TextAlign.Center,
            )

            Spacer(modifier = Modifier.height(55.dp))

            CustomButton("Entrar", Color(0xFFE52D71), Color.White,{})

            Spacer(modifier = Modifier.height(15.dp))

            CustomButton("Crear cuenta",
                Color(0xFFCCCCCC),
                Color(0xFF535353)
            ) { navController.navigate("sign up") }
        }

        Text(
            text = "Intercontinental Airlines",
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