package com.example.voco.data

import com.example.voco.model.Word
import com.example.voco.model.WordCategory

object VocoData {
    val wordList: MutableList<Word> = mutableListOf(
        Word("One", "Один", "One example", WordCategory.NUMBERS),
        Word("Two", "Два", "Two example", WordCategory.NUMBERS),
        Word("Three", "Три", "Three example", WordCategory.NUMBERS),
        Word("Four", "Четыре", "Four example", WordCategory.NUMBERS)
    )
}