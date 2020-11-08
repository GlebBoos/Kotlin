fun main(args: Array<String>) {


    print("Введите кол-во строк матрицы:")
    val userText1: String? = readLine()
    val n: String = userText1.toString()
    val n1=n.toInt();
    println();

    //Кол-во столбцов зафиксировано по задаче (3). Закомментированный блок делал для себя :)
    //print("Введите кол-во столбцов матрицы:")
    //val userText2: String? = readLine()
    //val m: String = userText2.toString()
    //val m1=m.toInt()
    //println();

    var table = Array(n1, { Array(3, {" "}) })


    //Заполнение матрицы
    //for (i in 0 until n1){
    //    for (j in 0 until 3)
    //    {
    //        var s1=i+1
    //        var s2=j+1;
    //        print("Введите элемент $s1 строки $s2 столбца:")
    //        var userText: String? = readLine()
    //        var x: String = userText.toString()
    //        table[i][j] = x
    //     }
    //}
    for (i in 0 until n1){
        var s1=i+1
        print("В строке $s1 введите название страны: ")
        var userText2: String? = readLine()
        var x2: String = userText2.toString()
        table[i][0] = x2

        print("В строке $s1 введите название столицы: ")
        var userText3: String? = readLine()
        var x3: String = userText3.toString()
        table[i][1] = x3

        print("В строке $s1 введите название валюты: ")
        var userText4: String? = readLine()
        var x4: String = userText4.toString()
        table[i][2] = x4

    }
    for (i in 0 until n1){
        for (j in 0 until 3)
        {
            var l=table[i][j]
            print("$l ")
        }
        println()
    }

}

