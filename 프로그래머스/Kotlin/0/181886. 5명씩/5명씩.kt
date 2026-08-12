class Solution {
    fun solution(names: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        answer = names.slice(names.indices step 5).toTypedArray()
        return answer
    }
}