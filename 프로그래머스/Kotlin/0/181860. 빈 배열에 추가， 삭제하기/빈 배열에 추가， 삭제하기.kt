class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer: IntArray = intArrayOf()
        answer = arr.indices.fold(listOf<Int>()) { acc, i -> 
            val value = arr[i]
            if (flag[i]) {
                acc.plus(List(value * 2) { value })
            } 
            else {
                acc.dropLast(value)
            }
        }.toIntArray()
        return answer
    }
}