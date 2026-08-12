class Solution {
    fun solution(start_num: Int, end_num: Int): IntArray {
        var answer: IntArray = intArrayOf()
        answer = (start_num downTo end_num).toList().toIntArray()
        return answer
    }
}