fun main() {
    val music = readln()
    println( when {
        music.equals("1 2 3 4 5 6 7 8") -> "ascending"
        music.equals("8 7 6 5 4 3 2 1") -> "descending"
        else -> "mixed"
    }
    )
}