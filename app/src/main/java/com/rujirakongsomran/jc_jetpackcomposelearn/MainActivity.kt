package com.rujirakongsomran.jc_jetpackcomposelearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rujirakongsomran.jc_jetpackcomposelearn.ui.theme.JC_JetpackComposeLearnTheme
import com.rujirakongsomran.jc_jetpackcomposelearn.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_JetpackComposeLearnTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        Text(
                            text = stringResource(id = R.string.app_name),
                            modifier = Modifier
                                .background(MaterialTheme.colors.primary)
                                .padding(16.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Box(
            modifier = Modifier
                .background(Color.Blue),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
                    .background(Color.Green)
            )
            Text(
                text = "I Love Android!",
                fontSize = 40.sp
            )
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
fun RowScope.CustomItem(
    weight: Float,
    color: Color = MaterialTheme.colors.primary
) {
    Surface(
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)
            .weight(weight),
        color = color
    ) {}
}

@Preview(showBackground = true)
@Composable
fun PreviewTextCustomization() {
    JC_JetpackComposeLearnTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            Text(
                text = stringResource(id = R.string.app_name),
                modifier = Modifier
                    .background(MaterialTheme.colors.primary)
                    .padding(16.dp)
            )
        }
    }
}

//@Preview(showBackground = true)
@Composable
fun PreviewGreeting() {
    JC_JetpackComposeLearnTheme() {
        Greeting()
    }
}

//@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JC_JetpackComposeLearnTheme {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            CustomItem(
                weight = 3f,
                color = MaterialTheme.colors.secondary
            )
            CustomItem(weight = 1f)
        }
    }
}