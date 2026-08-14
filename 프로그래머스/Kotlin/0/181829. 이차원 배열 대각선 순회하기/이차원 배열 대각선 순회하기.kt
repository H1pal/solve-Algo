class Solution {
    fun solution(board: Array<IntArray>, k: Int): Int {
        var answer: Int = 0
        answer = board.flatMapIndexed { i, r ->
            r.filterIndexed { j, _ -> i + j <= k
                
            }
        }.sum()
        return answer
    }
}