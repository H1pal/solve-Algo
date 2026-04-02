fun main() {
    generateSequence(::readlnOrNull)
        .forEach { println( it.split(" ").map { it.toInt()}.sumOf { it } ) }
}