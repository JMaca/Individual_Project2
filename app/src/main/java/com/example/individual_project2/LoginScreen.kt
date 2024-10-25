package com.example.individual_project2

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.pm.ShortcutInfoCompat.Surface


@Composable
fun LoginScreen() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp),
        verticalArrangement = Arrangement.Center,
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
            onClick = {}
        ) {
            Text(
                text = "Login"
            )
        }
    }
}
@Preview
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}