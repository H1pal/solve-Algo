class Solution {
    fun solution(my_string: String, indices: IntArray): String {
        var answer: String = ""
        answer = my_string.filterIndexed { idx, _ ->
            idx !in indices
        }
        return answer
    }
}