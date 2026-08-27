class Solution {
    fun solution(strArr: Array<String>): Int {
        var answer: Int = 0
        answer = strArr.groupingBy { it.length }.eachCount().maxByOrNull { it.value }?.value ?: 0

        return answer
    }
}