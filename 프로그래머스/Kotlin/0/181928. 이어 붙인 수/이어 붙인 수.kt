class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var odd = ""
        var even = ""
        
        answer = num_list.forEach { num ->
            when (num % 2) {
                1 -> odd += num.toString()
                0 -> even += num.toString()
                else -> {}
            }
        }.let { odd.toInt() + even.toInt() }
        
        return answer
    }
}