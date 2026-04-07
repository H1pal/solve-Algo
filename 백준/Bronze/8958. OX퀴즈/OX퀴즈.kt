fun main(){
    val cs = readln().toInt()
    var cnt = 0
    var total = 0
    repeat(cs) {
        val ox = readln()

        for (i in ox.indices) {
            if (ox[i] == 'O') {
                total += ++cnt
            }
            else cnt = 0
        }
        println(total)
        total = 0
        cnt = 0
    }
}