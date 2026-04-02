fun main() {
    val amount = readln().toInt()

    for (item in 1..amount) {
        println(readln().split(" ").sumOf { it.toInt() })
    }
}