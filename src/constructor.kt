class students(val name:String,val course:String,val age:Int,val pno:Int){
//  is leaving to be empty

}

fun main(args: Array<String>) {

//  instance for my class
    val obj=students("Brian","MIT",19,712345678)
    println("My name is ${obj.name}")
    println("I am doing ${obj.course}")
    println("I am ${obj.age} years old")
    println("My contact details are ${obj.pno}")

    val obj1=students("Sharon","Civil",23,756894321)
    println("My name is ${obj1.name}")
    println("I am doing ${obj1.course}")
    println("I am ${obj1.age} years old")
    println("My contact details are ${obj1.pno}")

    val obj2=students("Allan","Android",25,734562718)
    println("My name is ${obj2.name}")
    println("I am doing ${obj2.course}")
    println("I am ${obj2.age} years old")
    println("My contact details are ${obj2.pno}")

    val obj3=students("Dorcas","Java",28,765445623)
    println("My name is ${obj3.name}")
    println("I am doing ${obj3.course}")
    println("I am ${obj3.age} years old")
    println("My contact details are ${obj3.pno}")

    val obj4=students("Crystal","Kotlin",18,789765434)
    println("My name is ${obj4.name}")
    println("I am doing ${obj4.course}")
    println("I am ${obj4.age} years old")
    println("My contact details are ${obj4.pno}")

    val obj5=students("Danny","Html",30,764454345)
    println("My name is ${obj5.name}")
    println("I am doing ${obj5.course}")
    println("I am ${obj5.age} years old")
    println("My contact details are ${obj5.pno}")

}