class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        answer = arr.map {
            if (it >= 50 && it % 2 == 0) return@map it / 2
            else if (it <= 50 && it % 2 == 1) return@map it * 2
            else return@map it
        }.toIntArray()
        return answer
    }
}