fun main() {
    val input = listOf(
        "Metehan",
        "John",
        "Skye",
        "Adrienne",
        "Peter",
        "Metehan",
        "John",
        "Skye",
        "Adrienne",
        "Peter",
        "Metehan",
        "John",
        "Skye",
        "Adrienne",
        "Peter",
        "Metehan",
        "John",
        "Skye",
        "Adrienne",
        "Peter"
    )

    println(imperativeFindOdd(intArrayOf(1,2,3,4,5,6,7,8,9)))
    println(declarativeFindOdd(intArrayOf(1,2,3,4,5,6,7,8,9)))
}

fun packetIndex(packet: String, uniqueChar: Int): Int {
    val marker = packet
        .windowed(uniqueChar)
        .first { it.all(hashSetOf<Char>()::add) }
    return packet.indexOf(marker) + marker.length
}

fun part1(input: List<String>): Int = packetIndex(input.first(), 4)
fun part2(input: List<String>): Int = packetIndex(input.first(), 14)

fun imperativeFindOdd(numbers: IntArray): List<Int> {
    val result = mutableListOf<Int>()
    for (i in numbers.indices) {
        if (numbers[i] % 2 != 0) {
            result.add(numbers[i])
        }
    }
    return result
}

fun declarativeFindOdd(numbers: IntArray): List<Int> {
    return numbers.filter { it % 2 != 0 }
}

