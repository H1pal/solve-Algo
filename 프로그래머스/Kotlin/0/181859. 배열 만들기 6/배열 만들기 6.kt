import java.util.Deque
import java.util.LinkedList

class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val stk: Deque<Int> = LinkedList<Int>()
        var i = 0

        while (i < arr.size) {
            val index = arr[i++]
            if (stk.isEmpty()) {
                stk.addLast(index)
            }
            else if (stk.peekLast() == index) {
                stk.removeLast()
            }
            else {
                stk.addLast(index)
            }
        }

        answer = if (stk.isEmpty()) intArrayOf(-1) else stk.toIntArray()
        return answer
    }
}