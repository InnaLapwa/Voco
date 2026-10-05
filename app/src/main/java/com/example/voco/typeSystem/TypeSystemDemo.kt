package com.example.voco.typeSystem

import android.util.Log
import com.example.voco.model.Word

val vocoLogger = VocoLogger

object VocoLogger {
    fun log(message: String) {
        Log.d("test", message)
    }
}

fun printInfo(value: Any) {
    val message = "print info: $value"
    vocoLogger.log(message)
}

fun findWord(value: Word?) {
    val m = when (value) {
        null -> "null"
        else -> value
    }

    val message = "find word: $m"
    vocoLogger.log(message)
}

fun wordNotFound(value: Any): Nothing {
    vocoLogger.log("word not found")
    error(value)
}