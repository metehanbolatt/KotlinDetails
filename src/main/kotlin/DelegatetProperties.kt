import kotlin.reflect.KProperty

class Example {
    var data: String by DataDelegate()
}

class DataDelegate {
    private var _data: String? = null

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return _data ?: throw IllegalStateException("Data not initialized!")
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        _data = value
    }
}

fun main() {
    val example = Example()

    example.data = "Domates"
    println(example.data)
}