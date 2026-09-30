package com.example.voco.search

import com.example.voco.catalog.WordCatalogImpl
import com.example.voco.model.SearchResult
import com.example.voco.model.Word

class EnglishWordSearcher(): WordSearcher {
    override fun findWordByEnglish(text: String, words: List<Word>): SearchResult {
        val result = words.findLast { it.text == text }
        return when (result) {
            null -> SearchResult.NotFound
            else -> SearchResult.Found(result)
        }
    }
}