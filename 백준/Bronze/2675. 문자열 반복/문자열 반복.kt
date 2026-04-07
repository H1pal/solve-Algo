fun main() {
    val cs = readln().toInt()

    repeat(cs) {
        val (repeats, word) = readln().split(" ").map { it }

        word.toList().forEach { w -> repeat(repeats.toInt()) { print(w) } }.also { println() }
    }
}