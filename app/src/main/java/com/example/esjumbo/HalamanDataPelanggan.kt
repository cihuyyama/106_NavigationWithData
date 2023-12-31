package com.example.esjumbo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanDataPelanggan(
    onSubmitButtonClick: (MutableList<String>) -> Unit
) {
    var namaTxt by remember {
        mutableStateOf("")
    }

    var alamatTxt by remember {
        mutableStateOf("")
    }

    var noTelpTxt by remember {
        mutableStateOf("")
    }

    var listDataTxt: MutableList<String> = mutableListOf(namaTxt, alamatTxt, noTelpTxt)

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = namaTxt,
            onValueChange = {
                namaTxt = it
            },
            label = {
                Text(text = "Nama")
            }
        )
        OutlinedTextField(
            value = alamatTxt,
            onValueChange = {
                alamatTxt = it
            },
            label = {
                Text(text = "Alamat")
            }
        )
        OutlinedTextField(
            value = noTelpTxt,
            onValueChange = {
                noTelpTxt = it
            },
            label = {
                Text(text = "Telepon")
            }
        )

        Spacer(
            modifier = Modifier.padding(16.dp)
        )

        Button(
            onClick = {onSubmitButtonClick(listDataTxt)}
        ) {
            Text(text = stringResource(id = R.string.next))
        }
    }
}