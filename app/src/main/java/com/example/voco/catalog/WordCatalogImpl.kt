package com.example.voco.catalog

import com.example.voco.model.SearchResult
import com.example.voco.model.Word
import com.example.voco.search.WordSearcher

class WordCatalogImpl(val wordSearcher: WordSearcher): WordCatalog {
    private var wordList: MutableList<Word> = mutableListOf()

    override fun add(word: Word) {
        wordList.add(word)
    }

    override fun find(text: String): SearchResult {
        return wordSearcher.findWordByEnglish(text, wordList)
    }

    override fun getAll(): List<Word> {
        return wordList
    }
}