class Solution {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        answer = picture.flatMap { row ->
            val str: StringBuilder = StringBuilder()
            row.map { pixel ->
                str.append(pixel.toString().repeat(k))
            }
            List(k) { str.toString() }
        }.toTypedArray()
        return answer
    }
}