class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val lDigit = l.toString().length
        val rDigit = r.toString().length
        for (cDigit in lDigit..rDigit) {
            for (bits in 0 until (1 shl (cDigit-1))) {
                val sh = StringBuilder("1")
                for (j in cDigit - 2 downTo 0) {
                    sh.append(if ((bits shr j) and 1 == 1) '1' else '0')
                }
                val num = sh.toString().toInt() * 5
                if (num in l..r) {
                    answer += num
                }
            }
        }
        return if (answer.isEmpty()) intArrayOf(-1) else answer
    }
}