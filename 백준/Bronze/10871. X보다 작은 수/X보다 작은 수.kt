fun main() {
    val (amount, standard) = readln().split(" ").map { it.toInt() }
    val nlst = readln().split(" ").map { it.toInt() }

    for (i in nlst) {
        when{
            i < standard -> print("$i ")
        }
    }
}