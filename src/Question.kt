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
interface ProgressPrintable {
    val processText: String
    fun printProgressBar()
}
class Quiz: ProgressPrintable {
    override val processText: String
        get() = "${answered} of ${total} answered"

    override fun printProgressBar() {
        repeat(Quiz.answered) { print("//") }
        repeat(Quiz.total - Quiz.answered) { print("|") }
        println()
        println(processText)

    }

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
        var total: Int = 10
        var answered: Int = 3
    }

    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
            println()
        }

    }
}

fun main() {
    val quiz = Quiz().apply { printQuiz() }
}
