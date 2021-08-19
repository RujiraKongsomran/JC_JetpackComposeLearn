package com.rujirakongsomran.jc_jetpackcomposelearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rujirakongsomran.jc_jetpackcomposelearn.ui.theme.JC_JetpackComposeLearnTheme
import com.rujirakongsomran.jc_jetpackcomposelearn.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_JetpackComposeLearnTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                }
            }
        }
    }
}

@Composable
fun CustomText(text: String) {
    Text(
        text = text,
        style = Typography.h5
    )
}

@Composable
fun ColumnScope.CustomItem(weight: Float, color: Color = MaterialTheme.colors.primary) {
    Surface(
        modifier = Modifier
            .width(200.dp)
            .weight(weight),
        color = color
    ) {}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JC_JetpackComposeLearnTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
            CustomItem(weight = 1f)
        }
    }
}