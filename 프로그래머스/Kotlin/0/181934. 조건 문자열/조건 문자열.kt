class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer: Int = 0
        val result: Boolean = when (ineq) {
            "<" if eq == "=" -> n <= m
        "<" if eq == "!" -> n < m
        ">" if eq == "=" -> n >= m
        ">" if eq == "!" -> n > m
        else -> false
        }
        
        answer = if (result) 1 else 0
        return answer
    }
}