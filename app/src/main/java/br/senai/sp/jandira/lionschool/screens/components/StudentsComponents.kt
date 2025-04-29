package br.senai.sp.jandira.lionschool.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter

import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun studentsComponents(
    imagePerson: Painter = painterResource(id = R.drawable.lion_user),
    personName: String = "",
    registrationNumber: String = "",
    isFilled: Boolean = false
    ) {
    Card(
        modifier = Modifier
            .width(320.dp)
            .height(78.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(R.color.lion_color_purple_white)
        )
        ) {
        Row(
            modifier = Modifier
                .fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier
                    .weight(1f)
                    .width(12.dp)
                    .fillMaxHeight(),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(R.color.lion_color_yellow)
                ),
                shape = RoundedCornerShape(0.dp)
            ) {}
            Row(
                modifier = Modifier
                    .weight(20f)
                    .padding(5.dp)
                    .fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = if(isFilled) imagePerson else painterResource(id = R.drawable.image_not_found),
                    contentDescription = "",
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp)
                )
                Column(
                    modifier = Modifier
                        .padding(10.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = personName,
                        fontSize = 16.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            imageVector = Icons.Default.AccountBox,
                            contentDescription = "",
                            colorFilter = ColorFilter.tint(
                                colorResource(R.color.lion_color_light_gray)
                            ),
                            modifier = Modifier
                                .height(12.dp)
                                .width(12.dp)
                        )

                        Text(
                            text = registrationNumber,
                            color = Color.White,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Thin
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .weight(5f)
                    .fillMaxHeight()
                    .padding(8.dp),
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.calendario),
                    contentDescription = "",
                    modifier = Modifier
                        .width(10.dp)
                        .height(12.dp)
                        .padding()
                )
                Text(
                    text = "2025",
                    color = colorResource(R.color.lion_color_yellow),
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    textAlign = TextAlign.End,
                    modifier = Modifier
                        .width(25.dp)
                )
            }


        }

    }
}


@Preview
@Composable
private fun studentsComponentsPreview() {
    studentsComponents()
}