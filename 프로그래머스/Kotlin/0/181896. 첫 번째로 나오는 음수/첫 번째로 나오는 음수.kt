class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = -1
        
        for ((cnt, item) in num_list.withIndex()) {
            if (item < 0) {
                answer = cnt
                break
            }
        }

        return answer
    }
}