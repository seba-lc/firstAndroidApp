package com.sebastian.marketar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sebastian.marketar.ui.components.footer.Footer
import com.sebastian.marketar.ui.components.header.Header
import com.sebastian.marketar.ui.screens.main.LandingScreen
import com.sebastian.marketar.ui.screens.main.MainScreen
import com.sebastian.marketar.ui.theme.MarketarTheme

class MainActivity : ComponentActivity() { // KOTLIN | en este caso los : se traducen como que MainActivity es una extension de la clase ComponentActivity
    override fun onCreate(savedInstanceState: Bundle?) { // KOTLIN | en este caso se define el nombre de la variable : el tipo de variable. En JAVA seria al reves: primero el tipo de variable y despues el nombre
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController();
            NavHost(navController = navController, startDestination = "main") {
                composable("main") {
                    MainScreen(navController);
                }
                composable("landing") {
                    LandingScreen();
                }
            }
        }
    }
}

@Composable
fun MarketarApp(content: @Composable () -> Unit) {
    MarketarTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            color = MaterialTheme.colors.background
        ) {
            Column{
                content();
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!"
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MarketarTheme {
        Greeting("Android")
    }
}

