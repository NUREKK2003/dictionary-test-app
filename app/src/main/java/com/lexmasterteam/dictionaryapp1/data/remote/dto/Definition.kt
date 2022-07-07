package com.lexmasterteam.dictionaryapp1.data.remote.dto

data class Definition(
    val antonyms: List<Any>,
    val definition: String,
    val example: String,
    val synonyms: List<Any>
)