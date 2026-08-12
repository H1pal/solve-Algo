class Solution {
    fun solution(n: Int, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        answer = (k..n step k).toList().toIntArray()
        return answer
    }
}