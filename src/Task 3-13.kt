fun printUserGroup(vararg n: String){
    var l=n.count();
    println("Кол-во имен сотрудников в базе равно $l")
}

fun main(args: Array<String>) {
    var i:Int=0
    var listtomass : ArrayList<String> = arrayListOf()
    do
    {
        i++
        println("Введите имя $i -ого сотрудника. Для выхода из процедуры ввода введите exit")
        var userText2: String? = readLine()
        var x: String = userText2.toString()
        if (x!="exit") {
            listtomass.add(x)
       }
    }while (x!="exit")
    val mass: Array<String> = listtomass.toTypedArray()
    printUserGroup(*mass)
}