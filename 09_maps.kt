fun main() {
    val diccionario = mutableMapOf<String, String>(
        "rosa" to "La rosa es la flor mas bella",
        "rojo" to "Color primario"
    )    
//  println(diccionario)
//  diccionario.put("java", "Lenguaje para desarrollo backend")
// 	diccionario["kotlin"] = "Lenguaje de programacion para Android"
//  diccionario["rosa"] = "Nombre de persona"
//     println(diccionario)
//     println(diccionario.containsKey("kotlin"))
//     println(diccionario.remove("rosa"))

    val keys = diccionario.keys
    println(keys)
    println(keys.indices)
    for(key in keys) {
        println(key)
    }

    val entries = diccionario.entries
    for(entrie in entries) {
        println(entrie.key)
        println(entrie.value)
    }
}