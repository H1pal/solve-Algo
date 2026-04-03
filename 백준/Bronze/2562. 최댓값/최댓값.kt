import kotlin.io.println
import kotlin.math.max

fun main() {
    val lst = listOf(1, 2, 3, 4)
    val numlist = List(9) { readln().toInt() }

    println(numlist.max())
    println(numlist.indexOf(numlist.max()) + 1)
}