package com.example.voco.practice

import com.example.voco.model.SearchResult
import com.example.voco.model.Word
import com.example.voco.search.WordSearcher

fun createDemoSearcher(): WordSearcher {
    return object : WordSearcher {
        override fun findWordByEnglish(
            text: String,
            words: List<Word>
        ): SearchResult {
            return SearchResult.NotFound
        }
    }
}