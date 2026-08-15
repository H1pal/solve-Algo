class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        
        answer = queries.map { (s, e, k) ->
            var min: Int = -1
            (s..e).forEach {
                if (arr[it] > k && (min == -1 || min > arr[it])) min = arr[it]
            }
            min
        }.toIntArray()
        return answer
    }
}