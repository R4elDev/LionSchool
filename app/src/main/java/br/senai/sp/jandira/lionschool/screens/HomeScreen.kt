package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun HomeScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.BottomCenter
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(35.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround

        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
                Image(
                    painter = painterResource(id = R.drawable.logo_image),
                    contentDescription = stringResource(R.string.lion_school),
                    modifier = Modifier
                        .width(133.dp)
                        .height(166.dp)
                        .padding(vertical = 5.dp)
                )
                Text(
                    text = stringResource(R.string.lion_school),
                    fontSize = 40.sp,
                    color = colorResource(R.color.lion_color_blue),
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Default,
                    modifier = Modifier
                        .width(135.dp)
                        .padding(bottom = 45.dp)
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(23.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.branding),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.lion_color_blue),
                    modifier = Modifier
                        .padding(bottom = 5.dp)
                )
                Card(
                    modifier = Modifier
                        .width(60.dp)
                        .height(6.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(R.color.lion_color_yellow)
                    ),
                    shape = RoundedCornerShape(16.dp)
                ){}
                Text(
                    text = stringResource(R.string.branding_description),
                    fontSize = 16.sp,
                    color = colorResource(R.color.lion_color_gray),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(top = 25.dp)
                )
            }
            Button(
                onClick = {},
                modifier = Modifier
                    .width(276.dp)
                    .height(48.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.lion_color_yellow)
                ),
                border = BorderStroke(2.dp, colorResource(R.color.lion_color_blue))
            ) {
                Text(
                    text = stringResource(R.string.bottom_home),
                    color = colorResource(R.color.lion_color_blue),
                    fontWeight = FontWeight.SemiBold,
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    painter = painterResource(id = R.drawable.lion_youtube),
                    contentDescription = stringResource(R.string.youtube_description),
                    modifier = Modifier
                        .width(33.dp)
                        .height(33.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.lion_twitter),
                    contentDescription = stringResource(R.string.twiter_description),
                    modifier = Modifier
                        .width(33.dp)
                        .height(33.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.lion_instagram),
                    contentDescription = stringResource(R.string.instagram_description),
                    modifier = Modifier
                        .width(33.dp)
                        .height(33.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.lion_facebook),
                    contentDescription = stringResource(R.string.facebook_description),
                    modifier = Modifier
                        .width(33.dp)
                        .height(33.dp)
                )

            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview(){
    HomeScreen()
}
