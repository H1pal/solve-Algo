class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        answer = arr
        ((arr.size-1) downTo 0 step 2).forEach {
            answer[it] += n
        }
        
        
        return answer
    }
}