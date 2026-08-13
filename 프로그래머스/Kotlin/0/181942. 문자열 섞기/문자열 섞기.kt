class Solution {
    fun solution(str1: String, str2: String): String {
        var answer: String = ""
        var cnt: Int = 0
        answer = str1.split("").filterNot { it.isEmpty() }.joinToString("") {
        it + str2[cnt++]
    }
        return answer
    }
}