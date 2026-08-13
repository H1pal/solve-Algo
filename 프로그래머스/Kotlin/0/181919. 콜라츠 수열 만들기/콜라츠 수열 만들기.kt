class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var current: Int = n
        while (true) {
            answer += current
            if (current == 1) break
            if (current % 2 == 1) {
                current = 3*current+1
            } else {
                current /= 2
            }
            
        }
        return answer
    }
}