fun main() {
    val num = readln().toInt()

    for (i in 1..num) {
        for (j in   1..(num-i)) {
            print(" ")
        }
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}