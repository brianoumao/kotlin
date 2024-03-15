import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var continueCalculation = true

    while (continueCalculation) {
        println("Enter first number:")
        val num1 = scanner.nextDouble()

        println("Enter second number:")
        val num2 = scanner.nextDouble()

        println("Choose operation (+, -, *, /):")
        val operator = readLine()

        val result = when (operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> {
                if (num2 != 0.0)
                    num1 / num2
                else {
                    println("Error: Division by zero")
                    continue
                }
            }
            else -> {
                println("Invalid operator")
                continue
            }
        }

        println("Result: $result")

        println("Do you want to continue? (yes/no)")
        val choice = readLine()
        continueCalculation = choice.equals("yes", ignoreCase = true)
    }
}
