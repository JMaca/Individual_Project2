package com.example.individual_project2

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat.Style
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun QuizScreen(navController: NavHostController, modifier: Modifier = Modifier) {
    val qInfo = "We will ask you 5 questions and you will try to get them all correct.\",\n "
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
            .padding(8.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
        ) {

            Text(
                text = "Quiz Quest",
                fontSize = 45.sp,
                modifier = modifier.padding(16.dp)
            )
        }
        Text(
            text = "The rules are simple.\r\n" + qInfo,
            fontSize = 40.sp,
            modifier = modifier.padding(5.dp),
            textAlign = TextAlign.Center,
            maxLines = 8,
            lineHeight = 50.sp
        )
        Column {
            Box(
                modifier = Modifier.padding(50.dp)
            ) {
                Button(
                    onClick = {
                        navController.navigate(BottomNavigationItems.QuestionsScreen.route)
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Start Here! Do it! Clicky Clicky.")
                }
            }
        }

    }

}

@Preview
@Composable
fun Qprievew() {
    QuizScreen(rememberNavController())
}