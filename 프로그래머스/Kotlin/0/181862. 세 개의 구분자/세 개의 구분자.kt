class Solution {
    fun solution(myStr: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        answer = myStr
            .split("[a+|b+|c+]".toRegex())
            .filterNot { it == "" }
            .toTypedArray()
            
        
        return if (answer.isEmpty()) arrayOf("EMPTY") else answer
    }
}