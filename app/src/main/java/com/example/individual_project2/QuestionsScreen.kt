package com.example.individual_project2

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun QuestionsScreen (navController: NavController, modifier: Modifier = Modifier){
    var qAnswer1 by remember { mutableStateOf("") }
    var qAnswer2 by remember { mutableStateOf("") }
    var qAnswer3 by remember { mutableStateOf("") }
    var qAnswer4 by remember { mutableStateOf("") }
    var qAnswer5 by remember { mutableStateOf("") }

    Column(
    modifier = Modifier
    .verticalScroll(rememberScrollState())
    .padding(10.dp)
    ) {
        Box (
            modifier = Modifier.padding(10.dp).background(Color.Yellow).fillMaxWidth()
        ){

            Text(
                text = "Quiz Quest",
                fontSize = 38.sp,
                modifier = modifier.padding(bottom = 16.dp)
            )
        }
        Box(
            modifier = Modifier.padding(10.dp)
        )
        Column {
            RadioGroup(
                labelText = "How many states are there in the United States of America?",
                radioOptions = listOf("49", "50", "51"),
                selectedOption = qAnswer1,
                onSelected = { qAnswer1 = it },
                modifier = modifier
            )
            RadioGroup(
                labelText = "In what famous book could a line be quoted as Stay gold, Ponyboy?",
                radioOptions = listOf("Catcher in the Rye", "The Outsiders", "The Adventures of Huckleberry Fin"),
                selectedOption = qAnswer2,
                onSelected = { qAnswer2 = it },
                modifier = modifier
            )
            RadioGroup(
                labelText = "What are the 3 main layouts of Jetpack Compose App development?",
                radioOptions = listOf("Box,Row,Column", "Grid, Square, Rectangle", "Scaffold, App Bar, Column"),
                selectedOption = qAnswer3,
                onSelected = { qAnswer3 = it },
                modifier = modifier
            )
            RadioGroup(
                labelText = "What are the four fundamental components of Mobile Application Development?",
                radioOptions = listOf("Activity, Content Provider, Broadcast Receiver, Service",
                    "Cool Factor, Content Provider, UI, ", "Platform Version, Code Name, API Level, Service"),
                selectedOption = qAnswer4,
                onSelected = { qAnswer4 = it },
                modifier = modifier
            )
            RadioGroup(
                labelText = "What is the best Hockey Team in the NHL?",
                radioOptions = listOf("New York Rangers", "NY Rangers", "Rangers"),
                selectedOption = qAnswer5,
                onSelected = { qAnswer5 = it },
                modifier = modifier
            )
            Button(
                onClick = {
                    validateAnswers()
                },
                modifier = Modifier.padding(10.dp)
            ) {
                Text("Submit Answers")
            }
        }
        Box (
            modifier = Modifier.padding(10.dp)

        ){
            Button(
                onClick = {
                    navController.navigate(BottomNavigationItems.QuizScreen.route)
                },
                modifier = Modifier.padding(10.dp)
            ) {
                Text("Exit Quiz")
            }
        }
    }
}

fun validateAnswers() {

}

@Composable
fun RadioGroup(
    labelText: String,
    radioOptions: List<String>,
    selectedOption: String,
    onSelected: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    val isSelectedOption: (String) -> Boolean = { selectedOption == it }

    Column {
        Text(labelText)
        radioOptions.forEach { option ->
            Row(
                modifier = modifier
                    .selectable(
                        selected = isSelectedOption(option),
                        onClick = { onSelected(option) },
                        role = Role.RadioButton
                    )
                    .padding(8.dp)
            ) {
                RadioButton(
                    selected = isSelectedOption(option),
                    onClick = null,
                    modifier = modifier.padding(end = 8.dp)
                )
                Text(
                    text = option,
                    modifier = modifier.fillMaxWidth()
                )
            }
        }
    }
}
@Preview
@Composable
fun QuestionsScreenPreview(){
    QuestionsScreen(navController = rememberNavController())
}

