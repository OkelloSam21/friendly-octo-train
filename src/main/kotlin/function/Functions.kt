package function

import java.lang.Math.pow

fun addInt(num1: Int, num2: Int): Int {
    val result = num1 + num2
    return result
}

fun studentDetails(name: String, regNo: String, yearOfStudy: Int): String {
    return "name: $name \nregistration number: $regNo \nYear Of Study: $yearOfStudy \n"
}
fun binaryToDecimal(): Double {
    val leftMost = readln().toInt()
    val left = readln().toInt()
    val right = readln().toInt()
    val rightMost = readln().toInt()
    val result = leftMost * pow(2.0, 3.0)
    return result
}
fun main() {
    addInt(4, 3)
    print(studentDetails("Samuel", "COM/0053/21", 2))
    binaryToDecimal()
}
