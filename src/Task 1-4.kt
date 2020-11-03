fun main(args: Array<String>){
    println("Введите ваше имя:")
    var userText: String? = readLine()
    var stringText: String = userText.toString()
    println("Подозреваю, что вас зовут $stringText")
    print("Хорошего дня!")
}