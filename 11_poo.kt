fun main() {
	val per1 = Persona("juan", "perez", "av siempre viva")
    val est1 = Estudiante("juan", "perez", "av siempre viva", "R-12345")
    val prof1 = Profesor("juan", "perez", "av siempre viva", "1111111")
    println(est1.showDataAsString())
    est1.salirColegio()
    prof1.salirColegio()
}

open class Persona(val nombre: String, val apellido: String, private val direccion: String) {
    fun llegarColegio() {
        println("LLego al colegio")
    }
    
    open fun salirColegio() {
        println("Salir del colegio")
    }
}

class Estudiante(nombre: String, ape: String, direc: String, val rude: String) 
	: Persona(nombre, ape, direc), ShowData {
        override fun showDataAsString(): String {
            println(super.mostrarDireccion());
            return "Estudiante($nombre, $apellido, $rude ${mostrarDireccion()})"
        }
    }

class Profesor(nombre: String, ape: String, direc: String, val password: String) : Persona(nombre, ape, direc) {
    override fun salirColegio() {
        println("Salir del colegio a las 13:00")
    }
}

interface ShowData {
    fun showDataAsString(): String
}
