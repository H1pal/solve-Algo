class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        answer = arr.copyOf()
        
        var size = answer.size
        val targetNum = highestOneBit(size - 1) shl 1

        while (size < targetNum) {
            answer += 0
            size = answer.size
        }
        
        return answer
    }
    
    fun highestOneBit(n: Int): Int {
        var x = n
        x = x or (x shr 1)
        x = x or (x shr 2)
        x = x or (x shr 4)
        x = x or (x shr 8)
        x = x or (x shr 16)
        return x - (x shr 1)
    }
}