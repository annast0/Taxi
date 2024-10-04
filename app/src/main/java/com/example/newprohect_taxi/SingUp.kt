
package com.example.newprohect_taxi

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SingUp(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.background2),
            contentDescription = "Background Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
                .alpha(0.5f),
            contentScale = ContentScale.FillBounds
        )
        var text by remember { mutableStateOf(TextFieldValue("")) }
        var email by remember { mutableStateOf(TextFieldValue("")) }
        var password by remember { mutableStateOf(TextFieldValue("")) }
        var retutn_password by remember { mutableStateOf(TextFieldValue("")) }

        // Поле для ввода логина
        Box(
            modifier = Modifier
                .padding(top = 300.dp)
        ) {
            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                leadingIcon = {
                    Icon(Icons.Filled.Person, contentDescription = "User Icon")
                },
                placeholder = { Text("login") },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .clip(RoundedCornerShape(50.dp))
                    .background(Color.White),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Blue,
                    unfocusedBorderColor = Color.Gray
                )
            )
        }

        Box(
            modifier = Modifier
                .padding(top = 370.dp)
        ) {
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                leadingIcon = {
                    Icon(Icons.Filled.Lock, contentDescription = "Lock Icon")
                },
                placeholder = { Text("Password") },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .clip(RoundedCornerShape(50.dp))
                    .background(Color.White),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Blue,
                    unfocusedBorderColor = Color.Gray
                )
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 440.dp)
        ) {
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                leadingIcon = {
                    Icon(Icons.Filled.Lock, contentDescription = "Lock Icon")
                },
                placeholder = { Text("Password") },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .clip(RoundedCornerShape(50.dp))
                    .background(Color.White),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Blue,
                    unfocusedBorderColor = Color.Gray
                )
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 510.dp)
        ) {
            OutlinedTextField(
                value = retutn_password,
                onValueChange = { retutn_password = it },
                leadingIcon = {
                    Icon(Icons.Filled.Lock, contentDescription = "Lock Icon")
                },
                placeholder = { Text("Return Password") },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .clip(RoundedCornerShape(50.dp))
                    .background(Color.White),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Blue,
                    unfocusedBorderColor = Color.Gray
                )
            )
        }
        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 470.dp)
        ) {
            Button(
                onClick = { navController.navigate("StartScreen") },
                shape = RoundedCornerShape(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF3F425C)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .height(60.dp)
            ) {
                Text(
                    text = "SIGN UP",
                    color = Color.White,
                    fontSize = 18.sp
                )
            }
        }
    }
}