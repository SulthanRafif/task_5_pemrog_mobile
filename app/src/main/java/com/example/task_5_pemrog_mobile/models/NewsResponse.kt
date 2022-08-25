package com.example.task_5_pemrog_mobile.models

data class NewsResponse (
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
    )