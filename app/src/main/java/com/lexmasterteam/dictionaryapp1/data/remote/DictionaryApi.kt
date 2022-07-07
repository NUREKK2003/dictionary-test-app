package com.lexmasterteam.dictionaryapp1.data.remote

import com.lexmasterteam.dictionaryapp1.data.remote.dto.DictionaryDto
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {

    @GET("/api/v2/entries/en/{word}")
    suspend fun getDefinition(
        @Path("word") word: String
    ): List<DictionaryDto>
}