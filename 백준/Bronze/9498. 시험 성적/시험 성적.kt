fun main() {
    val num = readln().toInt()

    println(
        when {
            num >= 90 -> "A"
            num >= 80 -> "B"
            num >= 70 -> "C"
            num >= 60 -> "D"
            else -> "F"
        }
    )
}