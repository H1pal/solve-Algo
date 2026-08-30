class Solution {
    fun solution(n: Int): Array<IntArray> {
        var answer: Array<IntArray> = arrayOf<IntArray>()
        answer = Array(n) { IntArray(n) { 0 } }
        var num: Int = 0
        var i: Int = 0
        var j: Int = -1
        var index: Int = 1
        var rep: Int = n


        while (num < n*n) {
            repeat(rep--) {
                j += index
                answer[i][j] = ++num
            }

            repeat(rep) {
                i += index
                answer[i][j] = ++num
            }
            index = -index
        }
        
        return answer
    }
}