class Solution {    
    fun solution(date1: IntArray, date2: IntArray): Int {
        var answer: Int = 0
        val result = date1.zip(date2).map { (d1, d2) ->
        d1.compareTo(d2)
    }.firstOrNull {
            it != 0
        } ?: 0
        
        answer = if (result < 0) 1 else 0
        
        return answer
    }
}