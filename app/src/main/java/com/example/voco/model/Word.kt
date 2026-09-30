package com.example.voco.model


data class Word(
    val text: String,
    val translation: String,
    val example: String,
    val category: WordCategory
)