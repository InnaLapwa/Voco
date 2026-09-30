package com.example.voco.catalog

import com.example.voco.model.SearchResult
import com.example.voco.model.Word

interface WordCatalog {
    fun add(word: Word)
    fun find(text: String): SearchResult
    fun getAll(): List<Word>
}