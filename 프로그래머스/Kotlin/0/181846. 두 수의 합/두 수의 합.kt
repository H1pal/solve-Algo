class Solution {
    fun solution(a: String, b: String): String {
        var answer: String = ""
        val reA = a.reversed()
        val reB = b.reversed()
        val alen = a.length
        val blen = b.length
        val max: Int = maxOf(alen, blen)
        var floor: Int = 0

        (0..<max).forEach { idx ->
            val n1 = reA.getOrNull(idx)?.digitToInt() ?: 0
            val n2 = reB.getOrNull(idx)?.digitToInt() ?: 0
            val sum = n1 + n2 + floor

            answer += sum % 10
            floor = sum / 10
        }
        if (floor != 0) {
            answer += floor
        }

        return answer.reversed()
    }
}