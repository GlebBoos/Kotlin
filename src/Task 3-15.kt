fun main(args: Array<String>) {


    print("Введите кол-во строк массива: ")
    val userText1: String? = readLine()
    val n: String = userText1.toString()
    val n1=n.toInt();
    println();

    var lis : ArrayList<String> = arrayListOf()

    for (i in 0 until n1){
            print("Введите $i значение массива: ")
            var userText: String? = readLine()
            var x: String = userText.toString()
            lis.add(x)
        }

    val vyv = {println(lis)}
    vyv()
}

