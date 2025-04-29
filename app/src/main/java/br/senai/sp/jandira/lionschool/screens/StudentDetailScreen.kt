package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun StudentDetailScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.BottomCenter
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(25.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ){
                Image(
                    painter = painterResource(id = R.drawable.logo_image),
                    contentDescription = stringResource(R.string.lion_school),
                    modifier = Modifier
                        .width(45.dp)
                        .height(56.dp)
                        .padding(vertical = 5.dp)
                )
                Text(
                    text = stringResource(R.string.lion_school),
                    fontSize = 15.sp,
                    color = colorResource(R.color.lion_color_blue),
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Default,
                    modifier = Modifier
                        .width(50.dp)
                        .padding(bottom = 10.dp)
                )
            }
            Card(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(R.color.lion_color_yellow)
                )
            ){}
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(15.dp)
            ) {
                Card(
                    modifier = Modifier
                        .width(150.dp)
                        .height(150.dp),
                    shape = RoundedCornerShape(100.dp),
                    border = BorderStroke(5.dp, colorResource(R.color.lion_color_yellow))
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.lion_user_bigest),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                Text(
                    text = "Cellbit",
                    fontSize = 24.sp,
                    color = colorResource(R.color.lion_color_blue),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(5.dp)
                )
                Text(
                    text = "001 - Técnico em Desenvolvimento de Sistemas",
                    color = colorResource(R.color.lion_color_blue),
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun StudentDetailScreenPreview(){
    StudentDetailScreen()
}