package com.example.mytestfragment

import android.os.Bundle
import androidx.fragment.app.Fragment

fun <T: Fragment> T.withArgument(action: Bundle.() -> Unit): T {
    return apply{
        val args = Bundle().apply (action)
        arguments = args
    }
}
