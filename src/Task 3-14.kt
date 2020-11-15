fun per(a: String, b: String) {
    println("Данные по сотруднику ФИО: $a Должность: $b")
}

fun per(a: String, b:Int, c: String) {
    println("Данные по сотруднику ФИО: $a Возраст: $b Должность: $c")
}

fun per(a: String, b: String, c: String) {
    println("Данные по сотруднику ФИО: $a Семейное положение: $b Должность: $c")
}

fun per(a: String, b: Int, c:String, d:String) {
    println("Данные по сотруднику ФИО $a Возраст: $b Семейное положение: $c Должность: $d")
}

fun main(args: Array<String>) {
    //Если я правильно понял задание, то тут речь про одного сотрудника, а не массив/бд сотрудников
    println("ФИО сотрудника")
    var userText: String? = readLine()
    var fio: String = userText.toString()
    println("Должность сотрудника")
    var userText1: String? = readLine()
    var dol: String = userText1.toString()
    println("Возраст")
    var userText2: String? = readLine()
    var x: String = userText2.toString()
    var voz=x.toInt()
    println("Семейное положение")
    var userText3: String? = readLine()
    var sp: String = userText3.toString()
    println("Вывод данных №1")
    per(fio,dol)
    println("Вывод данных №2")
    per(fio,voz,dol)
    println("Вывод данных №3")
    per(fio,sp,dol)
    println("Вывод данных №4")
    per(fio,voz,sp,dol)

}