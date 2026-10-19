package com.example.voco.practice

import com.example.voco.model.Word
import com.example.voco.model.WordCategory

fun processWords(
    words: List<Word>,
    action: (Word) -> Boolean
): List<Word> {
    val filteredWords = mutableListOf<Word>()
    for (word in words) {
        if (action(word))
            filteredWords.add(word)
    }

    return filteredWords
}

fun hasTranslation(word: Word): Boolean = word.translation.isNotEmpty()

fun test() {
    val testWords = listOf<Word>(Word("One", "Один", "One example", WordCategory.NUMBERS))
    processWords(testWords, ::hasTranslation)

    val isNumberWord = createCategoryChecker(WordCategory.NUMBERS)
    val result = isNumberWord(testWords[0])
}

fun createCategoryChecker(category: WordCategory): (Word) -> Boolean {
    return { word ->
        word.category == category
    }
}
