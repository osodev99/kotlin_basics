fun main() { 
    if(3 > 4) {
        println("True")
    } else {
        println("False")
    }
    
    when(1) {
       1 -> println("Es 1")         
       2 -> {
         val c = 3
         println("Es 2")  
       }
       else -> println("Es otro numero")
    }
}