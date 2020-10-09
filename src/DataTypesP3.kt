
//Data Types

fun main(args : Array<String>){

    //4. Array Data Type
    // use by arrayOf() library function or by Array() constructor

    //using arrayOf()
    val num1 : IntArray = intArrayOf(1,2,3,4,5)
    println("Array number 0 is : "+num1[0])
    println("Array number 1 is : "+num1[1])
    println("Array number 2 is : "+num1[2])
    println("Array number 3 is : "+num1[3])


    //5.String Data Type
    //. Raw String and Escapeed String

    //Escape String uses escape characters
    val alpha1 : String
    alpha1 = " Hello My World\n"
    val alpha2 : String  = "Hello My \t World"

    //Raw String uses triple qoutes (""" """)

    val alpha3 : String = """
                          You are supposed
                           to
                           be arrested! """
    println(alpha1)
    println(alpha2)
    println()
    println(alpha3)

}