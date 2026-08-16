class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer: IntArray = intArrayOf()
        intStrs.forEach { 
            val t = it.substring(s until s+l).toInt()
            if (t > k) answer += t
        }
        return answer
    }
}