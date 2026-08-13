class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        val tmp: String = ""
        answer = (0..my_string.length-1).map {
            tmp.plus(my_string.drop(it))
        }
            .sorted()
            .toTypedArray()
        return answer
    }
}