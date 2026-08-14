class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        included.fold(a) { acc, i ->
            if (i) answer += acc
            acc + d
        }
        return answer
    }
}