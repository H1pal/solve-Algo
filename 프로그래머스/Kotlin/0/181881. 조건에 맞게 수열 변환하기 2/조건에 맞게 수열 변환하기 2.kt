class Solution {
    fun solution(arr: IntArray): Int {
        var answer: Int = 0
        var prevArray: List<Int> = arr.toList()
        var currentArray: List<Int>
        while (true) {
            currentArray = prevArray.map {
                if (it >= 50 && it % 2 == 0) it % 2
                else if (it <= 50 && it % 2 == 1) it * 2 + 1
                else it
            }
            if (prevArray == currentArray) break
            prevArray = currentArray
            answer++
        }
        return answer
    }
}