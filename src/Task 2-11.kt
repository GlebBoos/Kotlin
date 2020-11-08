import java.util.*

fun main(args: Array<String>) {
    val sotr = mutableMapOf<String, Int>()
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
                print("Введите ФИО сотрудника: ")
                val userText1: String? = readLine()
                var x1: String = userText1.toString()
                print("Введите рабочее место сотрудника ")
                val userText2: String? = readLine()
                var x2: String = userText2.toString()
                var x22=x2.toInt()
                var sotr2: Map<String, Int> = sortedMapOf(x1 to x22)
                sotr.putAll(sotr2)
                println("$sotr")
            }
            2 ->
            {
                print("Введите рабочее место сотрудника для поиска: ")
                val userText1: String? = readLine()
                var x1: String = userText1.toString()
                var x11=x1.toInt()
                val keys = sotr.filterValues { it == x11 }.keys
                println("$keys")
            }
            0 -> println("Выход из программы! ")
            else -> println("Ошибка! Некорректное значение!")
        }
    }while (a.toInt()>0)
}