class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        answer = query.foldIndexed(arr.toList()) { idx, acc, num ->
            if (idx % 2 == 1) {
                acc.drop(num.coerceAtMost(acc.size))                
            } else {
                acc.take((num+1).coerceAtMost(acc.size))
            }
        }.toIntArray()
        return answer
    }
}