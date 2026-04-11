fun main() {
    val cs = readln().toInt()
    var total = 1

    generateSequence { readln().split(" ").map { it.toInt() }}
        .take(cs)
        .forEach { (num, amo) -> repeat(amo) { total = (total * num) % 10 }
            .also {
                println(if (total != 0) total else 10) }; total = 1 }

//    repeat(cs) {
//        val (num, amo) =  readln().split(" ").map { it.toInt() }
//        repeat(amo) {total *= num}.also { println(if (total % 10 == 0) 10 else total % 10); total = 1 }
//    }
}