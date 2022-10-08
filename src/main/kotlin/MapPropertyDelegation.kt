import java.time.LocalDate

fun main() {

    val record: Map<String, Any> = mapOf(
        "id" to 12345,
        "title" to "Dokuz Eylul University",
        "author" to "Metehan Bolat",
        "date" to LocalDate.now()
    )
    val book = Book(record)
    println(book.id)
    println(book.title)
    println(book.author)
    println(book.date)
}

class Book(record: Map<String, Any>) {
    val id: Int by record
    val title: String by record
    val author: String by record
    val date: LocalDate by record
}