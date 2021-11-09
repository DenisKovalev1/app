package com.skillbox.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = """
            Build type = ${BuildConfig.BUILD_TYPE}
            Flavors = ${BuildConfig.FLAVOR}
            VersionCode = ${BuildConfig.VERSION_CODE}
            VersionName = ${BuildConfig.VERSION_NAME}
        """.trimIndent()

    }
}