class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var mul: Int = 1
        var sqr: Int = 0
        num_list.forEach { 
            mul *= it
            sqr += it
        }
        sqr *= sqr
        
        if (mul < sqr) {
            answer = 1
        }
        if (mul > sqr) {
            answer = 0
        }
        return answer
    }
}