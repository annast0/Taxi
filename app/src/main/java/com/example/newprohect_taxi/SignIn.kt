import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
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
import com.example.newprohect_taxi.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignIn(navController: NavController) {
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
        var password by remember { mutableStateOf(TextFieldValue("")) }

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

        // Поле для ввода пароля
        Box(
            modifier = Modifier
                .padding(top = 370.dp)
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

        // Текст "Forgot Password?"
        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 170.dp)
        ) {
            Text(
                text = "Forgot Password?",
                color = Color.Gray,
                fontSize = 20.sp,
                modifier = Modifier
            )
        }

        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 290.dp)
        ) {
            Button(
                onClick = {
                    navController.navigate("StartScreen")
                },
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
                    text = "SIGN IN",
                    color = Color.White,
                    fontSize = 18.sp
                )
            }
        }
        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 740.dp)
        ) {
            Text(
                text = "Create A New Account?",
                color = Color.Gray,
                fontSize = 20.sp,
                modifier = Modifier
                    .clickable {
                        navController.navigate("SingUp")
                    }
            )
        }
    }
}
