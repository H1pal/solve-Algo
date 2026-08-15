class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val diceSet: Set<Int> = setOf<Int>(a, b, c, d)
        val diceList = listOf<Int>(a, b, c, d)
        val diceCnt = diceList.groupingBy { it }.eachCount()


        val answer: Int = when (diceCnt.values.max()) {
            4 -> 1111 * a
            3 -> {
                val p = diceCnt.entries.first { it.value == 3 }.key
                val q = diceCnt.entries.first { it.value == 1 }.key
                (10 * p + q) * (10 * p + q)
            }
            2 -> {
                if (diceSet.size == 2) {
                    val (p, q) = diceCnt.keys.toList()
                    (p + q) * abs(p - q)
                } else {
                    diceCnt.filterValues { it == 1 }.keys.toList().mul()
                }
            }
            else -> diceList.min()
        }
        return answer
    }
    
    fun abs(n: Int): Int = if (n <= 0) -n else n

    fun List<Int>.mul(): Int = this[0] * this[1]
}