class Solution {
    fun solution(str_list: Array<String>, ex: String): String {
        val answer: String = str_list.filter { ex !in it }.joinToString("")
        return answer
    }
}