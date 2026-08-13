fun main(args: Array<String>) {
    val s1 = readln()
    val intervals = 'a' - 'A'
    var lower: String
    val regex = "[A-Z]".toRegex()
    val isUpper = s1.map {
        if (regex.matches(it.toString())) 1 else 0
    }.also { lower = s1.lowercase() }
    
    val answer = isUpper.mapIndexed { idx, n ->
        if (n == 1) lower[idx] else lower[idx].uppercase()
    }
    println(answer.joinToString(""))
}