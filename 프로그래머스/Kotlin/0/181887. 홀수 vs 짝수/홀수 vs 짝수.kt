class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        val even = (num_list.indices step 2).sumOf { num_list[it] }
        val odd = (1..<num_list.size step 2).sumOf { num_list[it] }
        answer = maxOf(odd, even)
        return answer
    }
}