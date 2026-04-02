fun main() {
    generateSequence(::readlnOrNull)
        .forEach { println( it.split(" ").sumOf { it.toInt() } ) }
}