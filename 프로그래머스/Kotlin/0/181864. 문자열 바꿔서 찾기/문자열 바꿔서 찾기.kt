class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0
        val patChged = pat.map {
            if (it == 'A') 'B' else 'A'
        }.joinToString("")
        
        println(patChged)
        
        answer = if (patChged in myString) 1 else 0
        return answer
    }
}