class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var edit: Int
        val last = num_list.last()
        val twoFromLast = num_list[num_list.lastIndex - 1]
        
        if (twoFromLast >= last) {
            answer = num_list + (last * 2)
        } else {
            answer = num_list + (last - twoFromLast)
        }
        
        return answer
    }
}