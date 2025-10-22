package com.example.mojifilmovi.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mojifilmovi.R
import com.example.mojifilmovi.app_ui.MojiFilmoviViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddMovieScreen(navController: NavController, viewModel: MojiFilmoviViewModel) {
    var naziv by remember { mutableStateOf("") }
    var zanr by remember { mutableStateOf("") }
    var godina by remember { mutableStateOf("") }
    var ocjena by remember { mutableStateOf(0) }

    val isFormValid = naziv.isNotBlank() && zanr.isNotBlank() && godina.isNotBlank() &&
            godina.toIntOrNull() != null && ocjena in 1..5

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = stringResource(R.string.app_name),
                            color = Color.White,
                            style = MaterialTheme.typography.displayMedium,
                            textAlign = TextAlign.Center
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = stringResource(R.string.nazad),
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Black)
            )
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = stringResource(R.string.dodaj_film),
                    style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier.padding(bottom = 24.dp)
                )

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(1.dp, Color.Black)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        OutlinedTextField(
                            value = naziv,
                            onValueChange = { naziv = it },
                            label = { Text(stringResource(R.string.naziv_filma), color = Color.Black) },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth()
                        )

                        OutlinedTextField(
                            value = zanr,
                            onValueChange = { zanr = it },
                            label = { Text(stringResource(R.string.zanr), color = Color.Black) },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth(),
                        )

                        OutlinedTextField(
                            value = godina,
                            onValueChange = { godina = it.filter { char -> char.isDigit() } },
                            label = { Text(stringResource(R.string.godina), color = Color.Black) },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth(),
                        )

                        Text(stringResource(R.string.ocjena), style = MaterialTheme.typography.bodyMedium, color = Color.Black)

                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            (1..5).forEach { i ->
                                IconButton(onClick = { ocjena = i }) {
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "Star $i",
                                        tint = if (i <= ocjena) Color.Yellow else Color.Gray
                                    )
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick = {
                        viewModel.insertFilm(
                            naziv = naziv,
                            zanr = zanr,
                            godina = godina.toInt(),
                            ocjena = ocjena
                        )
                        navController.popBackStack()
                    },
                    enabled = isFormValid,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .height(45.dp),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(
                        text = stringResource(R.string.submit),
                        color = Color.White,
                        style = MaterialTheme.typography.labelSmall
                    )
                }
            }
        }
    }
}

