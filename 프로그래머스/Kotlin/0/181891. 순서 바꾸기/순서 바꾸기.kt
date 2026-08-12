class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        answer = num_list.drop(n).plus(num_list.take(n)).toIntArray()
        return answer
    }
}