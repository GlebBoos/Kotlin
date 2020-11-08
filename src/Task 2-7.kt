fun main(args: Array<String>){
    //var i:Long=0;
    do {
        println("Введите число, соответствующее соответственному полю ввода")
        println("1. Введите фамилию пользователя")
        println("2. Введите имя пользователя")
        println("3  Введите дату рождения пользователя")
        println("4  Введите работодателя пользователя")
        println("5  Введите табельный номер пользователя")
        println("0  Нажмите 0 для выхода")
        val userText1: String? = readLine()
        var a: String = userText1.toString()
        when(a.toInt()){
            1 ->
                {
                    print("Фамилия: ")
                    val userText2: String? = readLine()
                    var fam: String = userText2.toString()
                }

            2 -> {
                    print("Имя: ")
                    val userText2: String? = readLine()
                    var nam: String = userText2.toString()
                }
            3 -> {
                    print("Дата рождения: ")
                    val userText2: String? = readLine()
                    var datr: String = userText2.toString()
                }
            4 -> {
                    print("Работодатель: ")
                    val userText2: String? = readLine()
                    var rab: String = userText2.toString()
                }
            5 -> {
                    print("Табельный номер: ")
                    val userText2: String? = readLine()
                    var tab: String = userText2.toString()
                }
            0 -> {
                    print("Работа с данной задачей завершена ")
                }

            else -> println("Ошибка! Некорректное значение!")
        }
    }while (a.toInt()>0)

}