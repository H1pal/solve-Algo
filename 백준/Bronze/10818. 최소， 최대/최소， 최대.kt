fun main() {
    val amount = readln().toInt()
    val num = readln().split(" ").map { it.toInt() }

    println(num.minOf { it })
    println(num.maxOf { it })
}