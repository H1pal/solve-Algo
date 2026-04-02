fun main() {
    val amount = readln().toInt()

    for (i in 1..amount) {
        val (n1, n2) = readln().split(" ").map { it.toInt() }
        println(n1 + n2)
    }
}