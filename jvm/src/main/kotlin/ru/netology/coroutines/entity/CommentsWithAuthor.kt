package ru.netology.coroutines.entity

import ru.netology.coroutines.dto.Author
import ru.netology.coroutines.dto.Comment


data class CommentsWithAuthor(
    val comment: Comment,
    val author: Author,
)