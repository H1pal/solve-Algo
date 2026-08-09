class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        arr.forEach { el ->
            repeat(el) {
                answer += el
            }
        }
        return answer
    }
}