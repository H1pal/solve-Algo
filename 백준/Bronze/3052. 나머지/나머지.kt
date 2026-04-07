fun main(){
    println(generateSequence { readln().toLong() % 42 }
        .take(10)
        .toSet()
        .size
    )
}