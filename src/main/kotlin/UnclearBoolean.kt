fun main() {
    // val isMale = false
    // if (isMale) println("Nice, It's a male!") else println("Iııııı.. What is going on?")

    println("What is your gender?")
    print("My gender is: ")
    val inputGender = readLine()
    val gender: Gender = if (inputGender == "Male") Gender.Male else Gender.Female

    when(gender) {
        is Gender.Male -> { println("Nice, It's a male!") }
        is Gender.Female -> { println("Wow, It's a female!") }
    }
}

sealed interface Gender {
    object Male: Gender
    object Female: Gender
}


