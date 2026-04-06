fun main() {
    val Case = readln().toInt()

    for (case in 1..Case) {
        val (height, width, seq) = readln().split(" ").map { it.toInt() }

        println(
            when {
                seq % height == 0 -> String.format("%d%02d", height, seq / height)
                else -> String.format("%d%02d", seq % height, seq / height + 1)
            }
        )
    }
}