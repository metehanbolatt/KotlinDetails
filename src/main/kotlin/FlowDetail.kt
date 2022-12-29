import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

fun main() {
    onEa()
    println("------------")
    coll()
}

fun onEa() {
    runBlocking {
        flowOf(1, 2, 3)
            .onEach { delay(100) }
            .onEach { println(it) }
            .launchIn(this)
        flowOf("a", "b", "c")
            .onEach { println(it) }
            .launchIn(this)
    }
}

fun coll() {
    runBlocking {
        flowOf(1, 2, 3)
            .onEach { delay(100) }
            .collect { println(it) }
        flowOf("a", "b", "c")
            .collect { println(it) }
    }
}
