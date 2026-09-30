package com.example.voco.search

import com.example.voco.model.SearchResult
import com.example.voco.model.Word

interface WordSearcher {
    fun findWordByEnglish(text: String, words: List<Word>): SearchResult
}