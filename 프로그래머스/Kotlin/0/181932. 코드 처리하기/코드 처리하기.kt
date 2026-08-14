class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode: Boolean = false
        code.forEachIndexed { idx, c ->
            if (c == '1') mode = !mode
            else if (mode && idx % 2 == 1) {
                answer += c
            } else if (!mode && idx % 2 == 0){
                answer += c
            }
        }
        
        return if (answer.isEmpty()) "EMPTY" else answer
    }
}