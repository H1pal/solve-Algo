class Solution {
    fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean): Boolean {
        var answer: Boolean = (x1 || x2) and (x3 || x4)
        return answer
    }
}