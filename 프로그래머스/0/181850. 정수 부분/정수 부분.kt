import java.lang.IO.println
import java.lang.IO.readln

class Solution {
    fun solution(flo: Double): Int {

        val answer: Int = flo.toInt()
        return answer
    }
}

fun main() {
    val flo = readln().toDouble()
    val solution = Solution().solution(flo)
    println(solution)
}

