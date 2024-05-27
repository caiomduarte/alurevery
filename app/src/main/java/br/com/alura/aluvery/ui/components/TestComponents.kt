package br.com.alura.aluvery.ui.components

import AluveryTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MyFirstComposable(){
    Text(text = "My first Composable")
}


@Preview(showSystemUi = true)
@Composable
fun ColumnPreview(){
    Column {
        Text("Primeiro Texto")
        Text("Segundo Texto")

    }
}


@Preview(showSystemUi = true)
@Composable
fun RowPreview(){
    Row {
        Text("Texto 01")
        Text("Texto 02")
    }
}

@Preview(showSystemUi = true)
@Composable
fun BoxPreview(){
    Box {
        Text("Texto 01")
        Text("Texto 02")
    }
}

@Preview(showSystemUi = true)
@Composable
fun CustomPreview(){
    Column(
        Modifier
        .padding(all = 8.dp)
        .background(color = Color.Blue)
        .fillMaxWidth()
        .fillMaxHeight()

    ) {

        Text("Texto 01")
        Text("Texto 02")

        Row (modifier = Modifier.padding(
            horizontal = 8.dp,
            vertical = 16.dp
        ).background(Color.Green)) {
            Text("Texto 03")
            Text("Texto 04")
        }
        Column {
            Box (Modifier.background(Color.Red) .padding(8.dp)) {
                Text("Texto 05")
                Text("Texto 06")
            }

            Text("Texto 07")
            Text("Texto 08")
        }
    }
}

@Preview(
    name = "MyFirstComposablePreview",
    showSystemUi = true,
    showBackground = true
)
@Composable
fun MyFirstComposablePreview(){
    AluveryTheme {
        Surface {
            MyFirstComposable()
        }
    }
}