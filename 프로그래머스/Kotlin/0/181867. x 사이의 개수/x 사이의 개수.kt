class Solution {
    fun solution(myString: String): IntArray {
        var answer: IntArray = intArrayOf()
        answer = myString
            .split('x')
            .map { it.length }
            .toIntArray()
            
        return answer
    }
}