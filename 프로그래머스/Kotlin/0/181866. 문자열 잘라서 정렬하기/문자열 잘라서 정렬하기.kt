class Solution {
    fun solution(myString: String): Array<String> {
        var answer: Array<String>
        var tmp: String = ""
        val tmpList: MutableList<String> = mutableListOf()
        val trimmed = myString.trim('x')
        trimmed.forEachIndexed { index, ch ->
            if (ch != 'x') {
                tmp += ch
            }
            else if (tmp.isNotEmpty()) {
                tmpList.add(tmp)
                println(tmp)
                tmp = ""
            }

            if (index == trimmed.lastIndex) tmpList.add(tmp)
        }

        answer = tmpList.sorted().toTypedArray()
        return answer
    }
}