class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        val interval = 'a' - 'A'
        answer = myString.map {
            if (it in "aA") it.uppercase() else it.lowercase()
        }.joinToString("")
        return answer
    }
}