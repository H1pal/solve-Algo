class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        val ar = a % 2
        val br = b % 2
        
        if (ar == 1 && br == 1) answer = a*a + b*b
        else if (ar == 1 || br == 1) answer = 2*(a+b)
        else answer = a - b
        
        if (answer < 0) answer = -answer
        return answer
    }
}