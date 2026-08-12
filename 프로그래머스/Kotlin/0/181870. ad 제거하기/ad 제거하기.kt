class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        answer = strArr.filter { "ad" !in it }.toTypedArray()
        return answer
    }
}