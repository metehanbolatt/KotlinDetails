fun main() {
    val regex = Regex("[^a-zA-Z0-9 ]{2}")
    val input = "Deneme._"
    val matches = regex.find(input)

    println("Mathces: ${matches?.value}")
}