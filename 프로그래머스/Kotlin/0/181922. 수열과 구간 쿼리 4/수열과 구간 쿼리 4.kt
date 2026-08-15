class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        answer = arr.copyOf()

        queries.forEach { (start, end, k) ->
            (start..end).forEach {
                if (it % k == 0) {
                    answer[it] += 1
                }
            }
        }
        return answer
    }
}