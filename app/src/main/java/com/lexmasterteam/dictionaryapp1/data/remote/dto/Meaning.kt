package com.lexmasterteam.dictionaryapp1.data.remote.dto

data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech: String
)