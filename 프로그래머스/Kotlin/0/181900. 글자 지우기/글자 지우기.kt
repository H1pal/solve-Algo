class Solution {
    fun solution(my_string: String, indices: IntArray): String {
        var answer: String = ""
        answer = my_string
        indices.forEach {
            answer = answer.take(it) + answer.drop(it+1)
        }
        return answer
    }
}