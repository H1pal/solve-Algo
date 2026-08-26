class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer = intArrayOf()
        var i = 0
        var size = answer.size

        while (size < k) {
            val index = arr.getOrNull(i++) ?: -1
            if (index == -1 || index !in answer) {
                answer += index
            }
            size = answer.size
        }
            
        return answer
    }
}