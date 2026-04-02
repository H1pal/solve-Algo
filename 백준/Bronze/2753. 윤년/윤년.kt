fun main() {
    val year = readln().toInt()
    
    println(if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) 1 else 0)
        
}