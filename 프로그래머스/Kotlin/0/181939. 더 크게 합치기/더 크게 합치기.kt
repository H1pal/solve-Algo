class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        val w1 = (a.toString() + b.toString()).toInt()
        val w2 = (b.toString() + a.toString()).toInt()
        answer = maxOf(w1, w2)
        return answer
    }
}