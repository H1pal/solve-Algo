fun main() {
    generateSequence(::readlnOrNull)
        .takeWhile { it.split(" ").sumOf { n -> n.toInt() } != 0 }
        .forEach { println( it.split(" ").sumOf { n -> n.toInt() } ) }
}