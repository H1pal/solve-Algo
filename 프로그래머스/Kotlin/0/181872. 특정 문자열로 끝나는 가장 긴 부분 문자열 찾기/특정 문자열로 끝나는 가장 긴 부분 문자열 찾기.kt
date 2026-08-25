class Solution {
    fun solution(myString: String, pat: String): String {
        var answer: String = ""
        var index = 0
        index = myString.lastIndexOf(pat)

        if (index != -1) {
            answer = myString.take(index+pat.length)
        }
        return answer
    }
}