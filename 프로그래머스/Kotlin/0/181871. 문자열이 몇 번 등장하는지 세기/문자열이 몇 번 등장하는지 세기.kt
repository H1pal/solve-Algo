class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0
        
        val patLen = pat.length
        if (pat in myString) {
            (0..myString.length-patLen).forEach {
                if (myString.slice(it..<it+patLen) == pat) answer++
            }
        }
        return answer
    }
}