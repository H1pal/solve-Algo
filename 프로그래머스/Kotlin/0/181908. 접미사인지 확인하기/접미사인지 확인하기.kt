class Solution {
    fun solution(my_string: String, is_suffix: String): Int {
        var answer: Int = 0
        if (my_string.takeLast(is_suffix.length) == is_suffix) {
            answer = 1 
        } else {
            answer = 0 
        }
        return answer
    }
}