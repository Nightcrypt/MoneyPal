package cm.lobe.loic.moneypal.chat

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import cm.lobe.loic.moneypal.ui.theme.Black
import cm.lobe.loic.moneypal.ui.theme.Orange

@Composable
fun ChatScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Orange),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Chat",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                color = Black
            )
        )
    }
}

@Composable
@Preview
fun ChatScreenPreview(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Orange),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Chat",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                color = Black
            )
        )
    }
}