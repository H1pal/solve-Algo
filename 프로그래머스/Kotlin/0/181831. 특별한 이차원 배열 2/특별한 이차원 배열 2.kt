class Solution {
    fun solution(arr: Array<IntArray>): Int {
        var answer: Int = 0
        val indi = arr.indices
        val size = arr.size
        val result: Boolean = indi.all {
            i -> (i..<size).all { j -> 
                arr[i][j] == arr[j][i]
            }
        }
        answer = if (result) 1 else 0
        return answer
    }
}