class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer: String = ""
        parts.forEachIndexed { idx, n ->
            
            answer += my_strings[idx]
                .slice(n[0]..n[1])
        }
        return answer
    }
}