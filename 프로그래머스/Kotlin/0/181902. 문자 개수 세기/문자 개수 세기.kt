class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = intArrayOf()
        var upperArr = IntArray(26) { 0 }
        var lowerArr = IntArray(26) { 0 }
        my_string.forEach {
            if ("[A-Z]".toRegex().matches(it.toString())) {
                upperArr[it-'A'] += 1
            } else if ("[a-z]".toRegex().matches(it.toString())) {
                lowerArr[it-'a'] += 1
            }
        }
        answer = upperArr + lowerArr
        return answer
    }
}