fun main() {
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val n3 = readln().toInt()

    val gro = (n1 * n2 * n3).toString()
    val lst = List(10) {0}.toMutableList()
    for (i in gro) {
        lst[i.digitToInt()] += 1
    }
    lst.forEach { println(it) }
}