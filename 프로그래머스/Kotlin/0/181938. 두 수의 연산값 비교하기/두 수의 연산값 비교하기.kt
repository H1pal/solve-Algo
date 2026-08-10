class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        val plusRes = (a.toString() + b.toString()).toInt()
        val mulRes = 2 * a * b
        
        answer = maxOf(plusRes, mulRes)
        return answer
    }
}