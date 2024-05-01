fun main() {
//     val suma: Int = 3
    val suma: (Int) -> Int = { it+20 }
    println(suma(5))

    val ages = mutableListOf<Int>(21,29,13,14,11,10)
    val result = myFilter(
        items = ages, 
        test = {
//         if (nro % 2 == 0) {
//             return true
//         } else {
//             return false
//         }
        
        	it % 2 == 0
    	}
    )
    
    println("result $result")

    val colors: List<String> = listOf("red", "blue", "purple")
//     val resultList = mutableListOf<Int>()
    
//     for(color in colors) {
//         resultList.add(color.length)
//     }

	val resultList = colors.map { it.length }
    
    println(colors)
    println(resultList)
}

fun myFilter(items: List<Int>, test: (Int) -> Boolean): MutableList<Int> {
    val newList = mutableListOf<Int>()
    for(item in items) {
        println(item)
        if(test(item)) {
            newList.add(item)
        }
    }
    
    return newList
}