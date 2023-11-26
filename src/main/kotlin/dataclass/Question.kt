package dataclass

import enums.Difficulty

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
