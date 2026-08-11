class Solution {
    fun solution(arr: IntArray, delete_list: IntArray): IntArray {
        
        val answer = arr.toList() - delete_list.toSet()
        return answer.toIntArray()
    }
}