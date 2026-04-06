fun main() {
    val word = readln()
    var abc = MutableList(26) { -1 }

    for (i in word) {
        abc[i.code - 'a'.code] = word.indexOf(i)
    }

    println(abc.joinToString(" "))
}
