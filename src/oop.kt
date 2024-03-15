class online{

//    data member
  var num1:Int=67
  var num2:Int=89

//    Member function
  fun sum():Int{

      return num1+num2

  }

}

fun main(args: Array<String>) {

    // instance of my class

    val myobj=online()
    println("The sum is ${myobj.sum()}")

}