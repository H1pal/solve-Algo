class Solution {
    fun solution(str1: String, str2: String): Int {
        var answer: Int = 0
        answer = when (str1 in str2) {
            true -> 1
            false -> 0
        }
        return answer
    }
}