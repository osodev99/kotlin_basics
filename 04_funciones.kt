fun main() {
    saludar()
    println(sumar(4,5))
    println(mostrarDatos(edad = 23, nombre = "rosa flores"))
    println(mostrarDatos(edad = 23, nombre = "juan perez", habilitado = true))
}

fun saludar(): Unit {
    println("hola")
}

fun sumar(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun mostrarDatos(nombre: String, edad: Int, habilitado: Boolean = false): String {
    val msg = if(habilitado) "esta habilitado" else "esta inhabilitad@"
    return "$nombre tiene $edad anios y esta $msg"
}