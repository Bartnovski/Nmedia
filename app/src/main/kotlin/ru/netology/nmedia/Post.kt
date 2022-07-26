package ru.netology.nmedia

data class Post(
    val id: Long,
    val author: String,
    val content: String,
    val published: String,
    val likedByMe: Boolean = false,
    val likesAmount: Long,
    val shared: Long,
    val videoResource: String? = null
)