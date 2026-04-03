import kotlin.io.println
import kotlin.math.max

fun main() {
    var mm = 0
    var al = 0

    for (i in 1..9) {
        val num = readln().toInt()

        if (num > mm) {
            mm = max(mm, num)
            al = i
        }
    }
    println(mm)
    println(al)
}