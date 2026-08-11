class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        var answer: Int = 0
        if (arr1.size == arr2.size) {
            val sum1 = arr1.sum()
            val sum2 = arr2.sum()
            if (sum1 > sum2) answer = 1
            else if (sum1 < sum2) answer = -1
            else answer = 0
            println("${sum1} ${sum2}")
        }
        else if (arr1.size > arr2.size) answer = 1
        else answer = -1
        return answer
    }
}