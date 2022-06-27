package cm.lobe.loic.moneypal.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cm.lobe.loic.moneypal.R
import cm.lobe.loic.moneypal.ui.theme.AppBackgroundColor
import cm.lobe.loic.moneypal.ui.theme.BodyTextColor
import cm.lobe.loic.moneypal.ui.theme.GreyBlack
import cm.lobe.loic.moneypal.ui.theme.Orange

@Composable
fun HomeScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(AppBackgroundColor),
    ){
        HomeScreenNoTontine()
    }
}

@Composable
fun HomeScreenNoTontine(
    userName : String = "Loic",
    modifier: Modifier = Modifier,
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
    ) {
        Text(
            text = "Welcome to MoneyPal",
            style = MaterialTheme.typography.h5,
            modifier = modifier
                .padding(top = 30.dp)
        )
        Text(text = "$userName,",
            style = MaterialTheme.typography.h6
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_account_balance_wallet_24),
            contentDescription = "wallet icon",
            modifier = modifier
                .padding(vertical = 70.dp)
                .size(100.dp),
            tint = BodyTextColor
        )
        Text(
            text = "You have no current tontine. To start you can",
            style = MaterialTheme.typography.subtitle1
        )
        Text(
            text = "Create a new tontine and add your contacts.",
            style = MaterialTheme.typography.subtitle1
        )
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Orange),
            modifier = modifier
                .padding(15.dp) //margin
                .padding(20.dp) //padding
        )
        {
            Text(
                text = "Create a new Tontine",
                color = Color.White
            )
        }
    }
}


@Composable
@Preview
fun HomeScreenPreview(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(AppBackgroundColor),
    ){
        HomeScreenNoTontine()
    }
}