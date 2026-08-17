class Solution {
    fun solution(q: Int, r: Int, code: String): String {
        var answer: String = ""
        (r until code.length step q).forEach {
            answer += code[it]
        }
        return answer
    }
}