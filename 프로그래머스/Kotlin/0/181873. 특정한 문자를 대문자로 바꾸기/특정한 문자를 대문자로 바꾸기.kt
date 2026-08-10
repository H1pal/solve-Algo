class Solution {
    fun solution(my_string: String, alp: String): String {
        var answer: String = ""
        val interval = 'a'.code - 'A'.code
        val chralp = alp[0]
        answer = my_string.replace(chralp, (chralp.code - interval).toChar())
        return answer
    }
}