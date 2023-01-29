package com.example.mytestfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonTest.setOnClickListener {
showInfoFragment()
        }

    }
private fun showInfoFragment() {
supportFragmentManager.beginTransaction()
    .replace(R.id.container, Fragment())
    .commit()
}


private fun toast (message: String){
    Toast.makeText(this, message,Toast.LENGTH_LONG).show()
}
}