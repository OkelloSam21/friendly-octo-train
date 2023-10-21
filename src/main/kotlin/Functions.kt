fun addInt(num1: Int, num2: Int): Int {
    val result = num1 + num2
    return result
}

fun studentDetails(name: String, regNo: String, yearOfStudy: Int): String {
    return "name: $name \nregistration number: $regNo \nYear Of Study: $yearOfStudy \n"
}
fun binaryToDecimal(): Int{

}
fun main() {
    addInt(4, 3)
    print( studentDetails("Samuel", "COM/0053/21", 2))
}
