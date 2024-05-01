fun main() {
    var nombre: String? = null
//     println(nombre?.length)
//     println(nombre!!.length)
//     var longitud = if(nombre == null) 0 else nombre?.length
    var longitud = nombre?.length ?: 0
    
    println(longitud)
}