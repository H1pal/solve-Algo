class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        var answer: Array<IntArray> = arrayOf<IntArray>()
        answer = arr.copyOf()

        val sideLength = maxOf(arr.maxOf { it.size }, arr.size)

        (arr.size..<sideLength).forEach { _ -> answer = answer.plus(IntArray(sideLength) { 0 }) }
        answer = answer.map { it.plus(IntArray(sideLength - it.size) { 0 }) }.toTypedArray()
        return answer
    }
}