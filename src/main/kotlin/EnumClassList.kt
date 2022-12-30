enum class Currency {
    TL, USD, EUR, XAU
}

inline fun <reified T: Enum<T>> listEnumValues(): List<T> =
    enumValues<T>().toList()

fun main() {
    println(enumValues<Currency>().toList()) // [TL, USD, EUR, XAU]
    /** We can use like this*/
    println(listEnumValues<Currency>()) // [TL, USD, EUR, XAU]
}

