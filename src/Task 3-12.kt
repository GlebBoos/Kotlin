fun main(args: Array<String>){
    println("Введите год для проверки")
    var userText: String? = readLine()
    var stringText: String = userText.toString()
    var god = stringText.toInt();
    check(god);
}
fun check(n: Int) {
    if (n%4==0) { println("Год високосный!") }
        else { println("Год не високосный...") }
}
