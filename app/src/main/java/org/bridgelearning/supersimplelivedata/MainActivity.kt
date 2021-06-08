package org.bridgelearning.supersimplelivedata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //creates main activity page, which has a container for fragment_main_view
        setContentView(R.layout.activity_main)
    }
}