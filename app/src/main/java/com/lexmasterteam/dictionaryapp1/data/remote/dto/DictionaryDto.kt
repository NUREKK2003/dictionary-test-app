package com.lexmasterteam.dictionaryapp1.data.remote.dto

data class DictionaryDto(
    val meanings: List<Meaning>,
    val origin: String,
    val phonetic: String,
    val phonetics: List<Phonetic>,
    val word: String
)