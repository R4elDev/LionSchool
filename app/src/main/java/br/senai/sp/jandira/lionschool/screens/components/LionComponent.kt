package br.senai.sp.jandira.lionschool.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun lionComponent(


){
    Card(
        modifier = Modifier
            .width(322.dp)
            .height(209.dp),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            colorResource(R.color.lion_color_blue),
                            colorResource(R.color.lion_color_light_white)
                        )
                    )
                )
        ){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(18.dp),
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.programming),
                        contentDescription = "",
                        modifier = Modifier
                            .height(102.dp)
                            .width(101.dp)
                    )
                    Text(
                        text = "DS",
                        fontSize = 64.sp,
                        color = colorResource(R.color.lion_color_yellow)
                    )
                }
                Column() {
                    Text(
                        text = "Desenvolvimento de Sistemas",
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Learn to develop web and mobile applications.",
                        color = Color.White,
                        fontWeight = FontWeight.Thin
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.watch_later),
                        contentDescription = "",
                        modifier = Modifier
                            .width(15.dp)
                            .height(15.dp)
                    )
                    Text(
                        text = "3 semestres",
                        color = Color.White,
                        modifier = Modifier
                            .padding(horizontal = 5.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun lionComponentPreview(){
    lionComponent()
}