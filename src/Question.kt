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
class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)
fun main() {
    val question1 = Question<String>(
        "ajkdash",
        "asjdasjd",
        "jfdsjf"
    )
    val question2 = Question<Boolean>(
        "ajkdash",
        false,
        "jfdsjf"
    )
    val question3 = Question<Int>(
        "ajkdash",
        28,
        "jfdsjf"


    )
    println(question1.answer)
    println(question2.answer)
    println(question3.answer)
}
