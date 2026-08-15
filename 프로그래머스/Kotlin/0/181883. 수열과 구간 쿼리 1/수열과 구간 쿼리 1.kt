class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        answer = arr.copyOf()
        queries.forEach { (i1, i2) ->
            (i1..i2).forEach {
                answer[it] += 1
            }
        }
        return answer
    }
}