package br.com.drbf.nestedlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.drbf.nestedlist.ui.MyNestedListScreen
import br.com.drbf.nestedlist.ui.Repos
import br.com.drbf.nestedlist.ui.theme.NestedListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NestedListTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyNestedListScreen(
                        modifier = Modifier.padding(innerPadding),
                        menus = Repos.menus,
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NestedListTheme {
        Greeting("Android")
    }
}