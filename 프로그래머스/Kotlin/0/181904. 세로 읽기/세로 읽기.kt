class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        var answer: String = ""
        answer = ((c-1)..<my_string.length step m).joinToString(separator = "") { my_string[it].toString() }
        return answer
    }
}