class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        answer = arr.copyOf()
        queries
        .forEach { (q1, q2) ->
            val tmp = answer[q1]
            answer[q1] = answer[q2]
            answer[q2] = tmp
        }
        return answer
    }
}