package br.com.alura.aluvery.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import br.com.alura.aluvery.model.Product
import br.com.alura.aluvery.sampledata.sampleProducts
import br.com.alura.aluvery.ui.components.ProductItem
import br.com.alura.aluvery.ui.theme.AluveryTheme

@Composable
fun TodosProdutosScreen(products: List<Product>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(16.dp)
    ) {

        item(span = { GridItemSpan(maxLineSpan) }) {
            Text(
                text = "Todos Produtos",
                fontSize = 18.sp,
            )
        }
        items(products) {
            ProductItem(product = it)

        }

    }


}

@Preview(showBackground = true)
@Composable
private fun TodosProdutosPreview() {
    AluveryTheme {
        Surface {
            TodosProdutosScreen(sampleProducts)
        }
    }
}