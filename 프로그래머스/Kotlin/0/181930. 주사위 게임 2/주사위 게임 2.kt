class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        var answer: Int = 0
        answer = if (a == b && b == c) threeNum(a, b, c, 3)
            else if (a == b || a == c || b == c) threeNum(a, b, c, 2)
            else threeNum(a, b, c)
        return answer
    }
    
    fun threeNum(a: Int, b: Int, c: Int, w: Int = 1): Int {
        if (w <= 1) return a.pow(w) + b.pow(w) + c.pow(w)
        return (a.pow(w) + b.pow(w) + c.pow(w)) * threeNum(a, b, c, w - 1)
    }
    
    fun Int.pow(n: Int = 2): Int {
        if (n <= 1) return this
        return this * this.pow(n - 1)
    }
}