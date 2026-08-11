class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        val interval = 'a' - 'A'
        answer = strArr.mapIndexed { index, t -> 
            if (index % 2 == 0) t.lowercase() 
            else t.uppercase()
        }.toTypedArray()
        return answer
    }
}