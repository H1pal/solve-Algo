class Solution {
    fun solution(order: Array<String>): Int {
        var answer: Int = 0
        val menus: Map<String, Int> = mapOf("americano" to 4500, "cafelatte" to 5000, "anything" to 4500)

        answer = order.fold(0) { acc, menu ->
            val filtered = menu.replace("ice|hot".toRegex(), "")
            acc + menus[filtered]!!
        }
        return answer
    }
}