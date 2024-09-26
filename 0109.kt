/**
 * 0109 – Clases I
 * Crea una clase de datos "coche" con marca, modelo y año de lanzamiento. Crea dos objetos de esa clase.
 */

data class Coche(
    var marca: String = "",
    var modelo: String = "",
    var anyoLanzamiento: Int = 0) {

    override fun toString(): String {
        return "$marca $modelo [$anyoLanzamiento]"
    }
}

fun main() {
    val coche1: Coche
    coche1 = Coche("Peugeot", "308", 2016)

    val coche2: Coche
    coche2 = Coche("Ford", "Fiesta", 2014)

    println(coche1)
    println(coche2)
}