class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        var answer: Int = -1
        var cnt: Int = idx
        for (item in (arr.drop(idx))) {
            if (item == 1) {
                answer = cnt
                break
            }
            cnt++
        }
        return answer
    }
}