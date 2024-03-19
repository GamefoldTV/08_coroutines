package ru.netology.coroutines.entity

import ru.netology.coroutines.dto.Author
import ru.netology.coroutines.dto.Post

data class PostWithCommentsAndAuthor(
    val post: Post,
    val author: Author?,
    val comments: List<CommentsWithAuthor>,
)