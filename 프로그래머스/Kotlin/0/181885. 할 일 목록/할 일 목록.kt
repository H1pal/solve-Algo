class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        answer = todo_list.filterIndexed { i, todo ->
            !finished[i]
        }.toTypedArray()
        return answer
    }
}