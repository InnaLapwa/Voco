package com.example.voco.typeSystem

import android.util.Log
import com.example.voco.model.Word
import com.example.voco.typeSystem.VocoLogger.log

object VocoLogger {
    fun log(message: String) {
        Log.d("test", message)
    }
}

fun printInfo(value: Any) {
    val message = "print info: $value"
    log(message)
}

fun findWord(value: Word?) {
    val m = if (value == null) "null" else value

    val message = "find word: $m"
    log(message)
}

fun wordNotFound(value: Word): Nothing {
    log("word not found")
    error(value)
}