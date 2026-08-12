class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        val len = num_list.size
        if (len > 10) {
            answer = num_list.sum()
        } else {
            answer = num_list.fold(1) { arr, num -> 
                arr * num
            }
        }
        return answer
    }
}