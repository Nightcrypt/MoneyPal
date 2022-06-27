package cm.lobe.loic.moneypal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import cm.lobe.loic.moneypal.chat.ChatScreen
import cm.lobe.loic.moneypal.home.HomeScreen
import cm.lobe.loic.moneypal.profile.ProfilScreen
import cm.lobe.loic.moneypal.ui.theme.MoneyPalTheme
import cm.lobe.loic.moneypal.ui.theme.Orange
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoneyPalTheme {
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    Scaffold(
                        bottomBar = { BottomNavigationBar(navController) }
                    ) {
                        NavHost(navController, startDestination = BottomNavItem.Home.route) {
                            composable(BottomNavItem.Home.route) {
                                HomeScreen()
                            }
                            composable(BottomNavItem.Chat.route) {
                                ChatScreen()
                            }
                            composable(BottomNavItem.Profile.route) {
                                ProfilScreen()
                            }
                        }
                    }
                }
            }
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        MoneyPalTheme {
        }
    }
}