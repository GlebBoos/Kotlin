fun main(args: Array<String>){
    println("Введите число a:")
    val userText1: String? = readLine()
    var a: String = userText1.toString()
    println("Введите число b:")
    val userText: String? = readLine()
    var b: String = userText.toString()
    val k=a.toInt()>b.toInt()
    println("а больше б?: $k")
}