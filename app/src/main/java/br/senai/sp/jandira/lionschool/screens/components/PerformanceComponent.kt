package br.senai.sp.jandira.lionschool.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.lionschool.R

@Composable
fun PerfomanceComponent(
    markColor: Color = Color.Red,
    text1: String = "",
    text2: String = "",
    isFilled: Boolean = false

) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(top = 5.dp)
            .fillMaxWidth()
    ){
        Text(
            text = "SIOP",
            color = colorResource(R.color.lion_color_light_gray),
            textAlign = TextAlign.Center
        )
        Spacer(
            modifier = Modifier
                .width(6.dp)
        )
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp),
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(
                containerColor = if(isFilled) markColor else Color.Transparent
            )
        ){
            Row (
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Text(
                    text = "teste",
                    modifier = Modifier.padding(end = 8.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun PerfomanceComponentPreview() {
    PerfomanceComponent()
}