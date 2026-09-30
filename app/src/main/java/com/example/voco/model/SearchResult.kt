package com.example.voco.model

sealed interface SearchResult {
    data class Found(val word: Word): SearchResult
    object NotFound: SearchResult
}