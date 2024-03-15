class kotlin{

    var num1:Int=23
    var num2:Int=50

    fun product():Int{

        return num1*num2
    }

}

fun main(args: Array<String>) {

    var myobj=kotlin()
    println("The product is ${myobj.product()}")



}