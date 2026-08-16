class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = ""
        answer = my_string
        queries.forEach { (r1, r2) ->
            answer = answer.replaceRange(r1..r2, answer.slice(r1..r2).reversed())
        }
        return answer
    }
}