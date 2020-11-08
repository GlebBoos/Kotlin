import java.util.*

fun main(args: Array<String>) {
    var sotr: Map<String, Int> = mapOf()
    //print("$sotr ")

    do {
        println("Меню:")
        println("1. Добавить сотрудника в базу")
        println("2. Поиск сотрудника по номеру рабочего места")
        println("0  Выход из программы")
        val userText: String? = readLine()
        var a: String = userText.toString()
        when(a.toInt()){
            1 ->
            {

            }
            2 ->
            {

            }
            0 -> println("Выход из программы! ")
            else -> println("Ошибка! Некорректное значение!")
        }
    }while (a.toInt()>0)
}