class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        var answer: Int = 0
        val rankList = rank.foldIndexed(listOf<Int>()) { idx, acc, _ ->
            if (attendance[idx]) acc.plus(idx)
            else acc
        }.sortedBy { rank[it] }

        answer = 10000 * rankList[0] + 100 * rankList[1] + rankList[2]
        return answer
    }
}