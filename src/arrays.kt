fun main(args: Array<String>){

    val myarr= arrayOf("banana", "mangoes", "apples", "lemon",67,89,90f,true,false)

    myarr[2]="watermelon"
//indexes
    println("i like eating ${myarr[2]}")
    val myarr2= arrayOf<Int>(5,7,3,6,-6,-8,4,34,23,67,0)
    val myarr3= arrayOf<Float>(4.6f,5.6f,7.8f,9.0f)
    val myarr4= arrayOf<String>("USA","Britain","Italy","Sweden")
    val myarr5= arrayOf<Char>('A','B','C','V','F','R','I')

    println(myarr2.sorted())
    println(myarr4.sorted())
    println(myarr5.sorted())
}