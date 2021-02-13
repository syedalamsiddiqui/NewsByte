package com.example.newsbyte

data class News(
    val totalResults : Int,
    val articles : List<Article>
) {
}