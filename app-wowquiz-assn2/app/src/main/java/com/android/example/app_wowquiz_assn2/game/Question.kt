package com.android.example.app_wowquiz_assn2.game

data class Question(
    val questionId: Int,
    val answer: Boolean,
    val attempted: Boolean = false,
    val answered: Boolean = false
)