package br.senai.sp.jandira.lionschool.screens

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
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import br.senai.sp.jandira.lionschool.screens.components.lionComponent

@Composable
fun CourseScreen(){
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
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
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
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                shape = RoundedCornerShape(12.dp),
                label = { Text(text = stringResource(R.string.outline_course)) },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = colorResource(R.color.lion_color_gray)
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = colorResource(R.color.lion_color_yellow),
                    unfocusedContainerColor = colorResource(R.color.lion_color_light_gray)
                )
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.lion_list),
                    contentDescription = "",
                    modifier = Modifier
                        .width(26.dp)
                        .height(26.dp)
                )
                Text(
                    text = stringResource(R.string.course),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.lion_color_blue),
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                lionComponent(
                    imageLogo = painterResource(id = R.drawable.ds),
                    textIcon = stringResource(R.string.ds),
                    textTitle = stringResource(R.string.ds_title),
                    textDescription = stringResource(R.string.ds_description),
                    textSemester = stringResource(R.string.semester),
                    isFilled = true
                )
                lionComponent(
                    imageLogo = painterResource(id = R.drawable.rds),
                    textIcon = stringResource(R.string.rds),
                    textTitle = stringResource(R.string.rds_title),
                    textDescription = stringResource(R.string.rds_description),
                    textSemester = stringResource(R.string.semester),
                    isFilled = true
                )
                lionComponent(
                    imageLogo = painterResource(id = R.drawable.ele),
                    textIcon = stringResource(R.string.ele),
                    textTitle = stringResource(R.string.ele_title),
                    textDescription = stringResource(R.string.ele_description),
                    textSemester = stringResource(R.string.semester),
                    isFilled = true
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CourseScreenPreview(){
    CourseScreen()
}