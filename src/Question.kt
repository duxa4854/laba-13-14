//class FillInTheBlankQuestion(
//    val questionText: String,
//    val answer: String,
//    val difficulty: String
//)
//class TrueOrFalseQuestion(
//    val questionText: String,
//    val answer: Boolean,
//    val difficulty: String
//)
//class NumericQuestion(
//    val questionText: String,
//    val answer: Int,
//    val difficulty: String
//)
data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
enum class Difficulty{
    EASY,
    MEDIUM,
    HARD
}

class Quiz {
    val question1 = Question<String>(
        "ajkdash",
        "asjdasjd",
        Difficulty.MEDIUM
    )
    val question2 = Question<Boolean>(
        "ajkdash",
        false,
        Difficulty.EASY
    )
    val question3 = Question<Int>(
        "ajkdash",
        28,
        Difficulty.HARD
    )
    companion object StudentProgress {
        var total:Int = 10
        var answered: Int = 3
    }
}
val Quiz.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered"
fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered){print("//")}
    repeat(Quiz.total - Quiz.answered){print("|")}
    println()
    println(Quiz.progressText)
}
fun main() {
    Quiz.printProgressBar()

}
