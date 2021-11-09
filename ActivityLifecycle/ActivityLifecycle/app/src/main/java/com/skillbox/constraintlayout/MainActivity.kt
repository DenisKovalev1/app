package com.skillbox.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.util.Patterns
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var state: FormState? = null

    val tag = "Activity Main"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DebugLogger.d(tag, "onCreate ${hashCode()}")

        if (savedInstanceState != null) {
            state = savedInstanceState.getParcelable(KEY_LOGIN) ?: error("error")
            if (state?.valid == false) {
                updateTextStatus()
            }
        }

//        loginButton.setOnClickListener {
//            trialEntry()
//        }

        buttonTest.setOnClickListener {
            Thread.sleep(10000)
        }
        loginButton.setOnClickListener {
            val enterEmailAddress = emailInput.text.toString()
            val emailEnterPatterns = Patterns.EMAIL_ADDRESS.matcher(enterEmailAddress).matches()
            if (emailEnterPatterns && emailInput.text.isNotEmpty() && passwordInput.text.isNotEmpty()) {
                state = FormState(false, "Вы вошли в систему")
                updateTextStatus()
            } else {
                state = FormState(false, "Не верный Логин или пароль")
                updateTextStatus()
            }
            if (emailEnterPatterns && emailInput.text.isNotEmpty() && passwordInput.text.isNotEmpty() && !checkbox.isChecked) {
                state = FormState(false, "Заполните все поля")
                updateTextStatus()
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(KEY_LOGIN, state)
    }

    override fun onStart() {
        super.onStart()
        DebugLogger.d(tag, "onStart ${hashCode()}")
    }

    override fun onResume() {
        super.onResume()
        DebugLogger.d(tag, "onResume ${hashCode()}")
    }

    override fun onPause() {
        super.onPause()
        DebugLogger.d(tag, "onPause ${hashCode()}")
    }

    override fun onStop() {
        super.onStop()
        DebugLogger.d(tag, "onStop ${hashCode()}")
    }

    override fun onDestroy() {
        super.onDestroy()
        DebugLogger.d(tag, "onDestroy").hashCode()
    }

    private fun updateTextStatus() {
        textViewStatus.text = state?.message
    }

//    private fun toast(text: String) {
//        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
//    }

//    private fun trialEntry() {
//        progressShou.visibility = View.VISIBLE
//        loginButton.isEnabled = false
//        emailInput.isEnabled = false
//        checkbox.isEnabled = false
//        passwordInput.isEnabled = false
//
//        Handler().postDelayed({
//            progressShou.visibility = View.GONE
//            loginButton.isEnabled = true
//            emailInput.isEnabled = true
//            checkbox.isEnabled = true
//            passwordInput.isEnabled = true
//
//
//        }, 1000)
//
//    }

    companion object {
        private const val KEY_LOGIN = "Counter"
    }
}

object DebugLogger {
    fun d(tag: String, message: String) {
        Log.d(tag, message)
    }
}
