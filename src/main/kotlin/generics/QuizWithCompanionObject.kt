package generics

import enums.Difficulty

class QuizWithCompanionObject {
    val question1 = Quiz<String>("Quoth the raven ___", "never more", Difficulty.MEDUIM)
    val question2 = Quiz<Boolean>("The sky is blue, true or false", true, Difficulty.EASY)
    val question3 = Quiz<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
}

fun main() {
    println("${QuizWithCompanionObject.answered} of ${QuizWithCompanionObject.total} answered.")
}


