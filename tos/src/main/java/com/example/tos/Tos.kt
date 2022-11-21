package com.example.tos

import android.content.Context
import android.widget.Toast

@Suppress("unused")
fun Context.tos(msg: String) {
    Toast.makeText(this, "Ini tos $msg", Toast.LENGTH_SHORT).show()
}