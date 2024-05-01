fun main() {
    // inmutable
    val colors: List<String> = listOf("red", "blue")
//     val colors = listOf<String>("red", "blue")
//     println(colors)
    
    // mutable
    val ages: MutableList<Int> = mutableListOf(23,32,21,29,13,14,11,10)
    val ages = mutableListOf<Int>(23,32,21,29,13,14,11,10)
//     println(ages)
//     ages.add(32)
//     println(ages.isEmpty())
//     println(ages.size)
//     println(ages.indexOf(32))
//     println(ages.indices)
    
    for(i in ages.indices) {
        println(ages[i])
    }
    
}

