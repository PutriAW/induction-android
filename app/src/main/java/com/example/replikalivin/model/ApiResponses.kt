package com.example.replikalivin.model

import java.security.CodeSource

data class ApiResponses(
    val status: String,
    val totalResults: Int,
    val articles: List<article>
)

data class article(
    val source: listSource,
    val author: String?,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishedAt: String,
    val content: String
)

data class listSource(
    val id: String?,
    val name: String
)