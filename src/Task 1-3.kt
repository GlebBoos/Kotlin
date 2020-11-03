fun main(args: Array<String>){

    try {
        val five: Char ='5'
        println(five.toString())//конвертация в string
        var k=five.toString();//не знаю почему, но формат типа char не конвертировался до его промежуточной конвертации в string
        println(k.toByte())//конвертация в byte
        println(k.toShort())//конвертация в short
        println(k.toInt())//конвертация в int
        println(k.toDouble())//конвертация в double
        println(k.toFloat())//конвертация в float
        println(k.toLong())//конвертация в long
    }
    catch(e: NumberFormatException){
        println(e.message)}
}