class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        answer = num_list.slice(num_list.indices step n).toIntArray()
        return answer
    }
}