fun main(args: Array<String>) {

    println("Введите необходимые банковские данные:")
    print("1. Введите сумму вклада:")
    val userText: String? = readLine()
    val x: String = userText.toString()
    val sum = x.toInt();
    println();

    print("2. Введите срок вклада в месяцах:")
    val userText1: String? = readLine()
    val x1: String = userText1.toString()
    val srok = x1.toByte();
    println();

    print("3  Введите процент вклада:")
    val userText2: String? = readLine()
    val x2: String = userText2.toString()
    val proc = x2.toByte();
    println();

    var sumproc=proc*sum/100;

    for (i in 1..srok){
        var x=sumproc*i;
        var k=sum+x;
        println("Сумма за $i месяц составляет $k, бюджет увеличился на $x ")

    }




}