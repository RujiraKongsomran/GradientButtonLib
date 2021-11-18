package com.rujirakongsomran.gradientbuttonlib

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.rujirakongsomran.gradient_button.GradientButton
import com.rujirakongsomran.gradientbuttonlib.ui.theme.GradientButtonLibTheme
import com.rujirakongsomran.gradientbuttonlib.ui.theme.Purple200
import com.rujirakongsomran.gradientbuttonlib.ui.theme.Purple500

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GradientButtonLibTheme {

            }
        }
    }
}
