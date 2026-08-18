class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        answer = arr.dropWhile { it != 2 }.dropLastWhile { it != 2 }.toIntArray()
        return if (answer.isEmpty()) intArrayOf(-1) else answer
    }
}