class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""
        answer += my_string.take(s)
        answer += overwrite_string
        answer += my_string.substring(s+overwrite_string.length)
        return answer
    }
}