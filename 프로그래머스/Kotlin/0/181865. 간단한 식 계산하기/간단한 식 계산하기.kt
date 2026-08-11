class Solution {
    fun solution(binomial: String): Int {
        var answer: Int = 0
        val (n1, op, n2) = binomial.split(' ')
        val (num1, num2) = arrayOf(n1, n2).map {it.toInt()}
        answer = when (op) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            else -> 0
        }
        return answer
    }
}