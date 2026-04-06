fun main() {
    val word = readln().split(" ")

    var cnt = 0
    for (i in word) {
        if (i != "") {
            cnt++
        }
    }

    println(cnt)
}