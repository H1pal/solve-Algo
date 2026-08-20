class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        val lr = str_list.firstOrNull { it == "l" || it == "r" } ?: ""

        when (lr) {
            "l" -> answer = str_list
                .takeWhile { it != "l" }
                .toTypedArray()
            "r" -> answer = str_list
                .dropWhile { it != "r" }
                .drop(1)
                .toTypedArray()
        }
        
        
        
        return answer
    }
}