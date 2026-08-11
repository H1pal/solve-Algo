class Solution {
    fun solution(n: Int, control: String): Int {
        var answer: Int = 0
        answer = n
        for (k in control) {
            if (k == 'w') { answer++ }
            if (k == 's') { answer-- }
            if (k == 'd') { answer += 10 }
            if (k == 'a') { answer -= 10 }
        }
        return answer
    }
}