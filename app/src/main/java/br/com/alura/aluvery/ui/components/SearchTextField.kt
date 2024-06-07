package br.com.alura.aluvery.ui.components

import android.util.Log
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.alura.aluvery.sampledata.sampleProducts

@Composable
fun SearchTextField(searchText: String, onSearchChange: (String) -> Unit) {

    OutlinedTextField(value = searchText, onValueChange = { newvalue ->
        onSearchChange(newvalue)

    },
        Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(100),

        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = "Ícone de Lupa")

        },

        label = {
            Text(text = "Produtos")
        },
        placeholder = {
            Text(text = "O que você procura?")
        }
    )


}