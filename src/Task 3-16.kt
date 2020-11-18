import kotlin.math.sqrt

fun main(args: Array<String>) {

    fun Double.squared() = sqrt(this)

    print("Введите число, для которого будет извлекаться корень: ")
    val userText1: String? = readLine()
    val n: String = userText1.toString()
    val x=n.toDouble();
    println();

    println(x.squared())

}