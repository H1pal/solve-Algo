class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        answer = myString.replace("[a-k]".toRegex(), "l")
        return answer
    }
}