open class parent{
    var mumlikes="Likes cooking"
    var dadlikes="Watching football"
    var mumcolor="Light skin"
    var dadcolor="Dark skin"

}
class boy:parent(){

    fun mvu(){

       println("The boy likes $dadlikes and he is $dadcolor")

    }

}
class girl:parent(){
    fun msc(){
        println("The girl likes $mumlikes and she is $mumcolor")

    }

}

fun main(args: Array<String>) {
    val obj=boy()
    obj.mvu()

    val obj2=girl()
    obj2.msc()
}