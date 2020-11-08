
import java.util.*


fun main(args: Array<String>) {
    var numbers : ArrayList<String> = arrayListOf()
    //print("$numbers ")

    do {
        println("Меню:")
        println("1. Добавить название города в базу")
        println("2. Посмотреть в консоли список всех добавленных городов")
        println("3  Посмотреть список добавленных городов без повторений ")
        println("0  Выход из программы")
        val userText: String? = readLine()
        var a: String = userText.toString()
        when(a.toInt()){
            1 ->
            {
                print("Введите название города для добавления в базу: ")
                val userText1: String? = readLine()
                var x1: String = userText1.toString()
                numbers.add(x1)
            }
            2 ->
            {
                println("Список городов: ")
                print("$numbers ")
            }
            3 ->
            {
                println("Список городов без повторов: ")
                var numbers2 : ArrayList<String> = numbers
                val set: Set<String> = HashSet<String>(numbers2)
                numbers2.clear()
                numbers2.addAll(set)
                print("$numbers2 ")
            }
            0 -> println("Выход из программы!")
            else -> println("Ошибка! Некорректное значение!")
        }
    }while (a.toInt()>0)
}