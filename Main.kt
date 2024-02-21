import kotlin.reflect.KParameter

fun main() {
    printName( "Axum")
var x=modulus(50, 100)
    println(x)
    var y=add(4,6,8,10)
    println(y)
     fact( " Kind")
}


fun printName(name: String){
    println("Hello"+ ""  +name)
}


    fun modulus(num1: Int ,num2: Int):Int {
        var results = num1 % num2
        return results
    }

        fun add(num1: Int ,num2: Int , num3: Int , num4: Int):Int {
            var results = num1 + num2 + num3 + num4
            return results
        }

fun fact(word: String){
    println(word)

}


