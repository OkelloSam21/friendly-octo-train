package function

// write a function that satisfies the following

// function takes 2 strings for first and last name
// function takes a formatting function parameter
// function should print the result of the passed format function

fun nameFormatter(firstName: String, LastName: String, format: (String, String) -> String) {
    println("Full Name is: ${format(firstName, LastName)}")
}

fun main() {
    nameFormatter("Samuel", "Okello") { fName, lName ->
        "$fName $lName"
    }
}
