class Solution {
    fun solution(arr: IntArray): IntArray {
        var stk: IntArray = intArrayOf()
        var prev: Int = 0
        var i: Int = 0
        while (i < arr.size) {
            if (stk.isEmpty()) {
                stk += arr[i]
                prev = arr[i++]
            }
            else if (prev < arr[i]) {
                stk += arr[i]
                prev = arr[i++]
            }
            else if (prev >= arr[i]) {
                stk = stk.dropLast(1).toIntArray()
                if (stk.isEmpty()) continue
                prev = stk.last()
            }
        }
        return stk
    }
}