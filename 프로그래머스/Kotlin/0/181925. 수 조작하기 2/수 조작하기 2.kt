class Solution {
    fun solution(numLog: IntArray): String {
        var answer: String = ""
        var prev: Int = numLog[0]
        numLog.drop(1).forEach {
            answer += when (prev - it) 
            {
                1 -> "s"
                -1 -> "w"
                10 -> "a"
                -10 -> "d"
                else -> {}
            }
            prev = it
        }
        
        return answer
    }
}