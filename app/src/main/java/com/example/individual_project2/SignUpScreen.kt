package com.example.individual_project2

import android.content.Intent
import android.widget.TextView
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun SignUpScreen() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var dateOfBirth by remember { mutableStateOf("") }
    var familyName by remember { mutableStateOf("") }

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Box(
            modifier = Modifier.fillMaxWidth()
                .fillMaxHeight(0.30f)
                .background(Color.Cyan),


            ) {
            Text(
                text = "Welcome!\r\nPlease SignUp Here",
                modifier = Modifier.padding(50.dp),
                style = MaterialTheme.typography.headlineLarge,
                textAlign = TextAlign.Center

            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(28.dp),

            horizontalAlignment = Alignment.CenterHorizontally,
            ) {
            TextField(
                value = email,
                onValueChange = { email = it },
                Modifier.padding(16.dp).border(BorderStroke(width = 2.dp, color = Color.Black)),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent
                ),
                label = { Text("Email") },
            )


            TextField(
                value = password,
                onValueChange = { password = it },
                Modifier.padding(16.dp)
                    .border(BorderStroke(width = 2.dp, color = Color.Black)),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent
                ),
                label = {
                    Text("Password")
                },
            )
            Button(
                modifier = Modifier,
                onClick = {
                    if (validateSignUp(email, password)) {
                        Toast.makeText(context, "Login Success", Toast.LENGTH_SHORT).show()
                        loginSuccess()
                    } else {
                        Toast.makeText(context, "Email or Password Error", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            ) {
                Text(
                    text = "Login"
                )
            }
        }
    }
}
fun signUpSuccess() {
    val intent = Intent()
}

fun validateSignUp(email: String, password: String): Boolean {
    return false
}

@Preview
@Composable
fun SignUpScreenPreview(){
    SignUpScreen()
}