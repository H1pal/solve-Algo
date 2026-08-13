class Solution {
    fun solution(n: Int): Array<IntArray> {
        var answer: Array<IntArray> = arrayOf<IntArray>()
        answer = Array(n) { r -> IntArray(n) { c -> if (r == c) 1 else 0  } }
        return answer
    }
}