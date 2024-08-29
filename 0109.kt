/**
 * 0109 – Clases I
 * Crea una clase de datos "coche" con marca, modelo y año de lanzamiento. Crea dos objetos de esa clase.
 */

class Coche {
    var marca: String = ""
    var modelo: String = ""
    var anyoLanzamiento: Int = 0

    fun inicializar(marca: String, modelo: String, anyoLanzamiento: Int) {
        this.marca = marca
        this.modelo = modelo
        this.anyoLanzamiento = anyoLanzamiento
    }

    override fun toString(): String {
        return "$marca $modelo [$anyoLanzamiento]"
    }
}

fun main() {
    val coche1: Coche
    coche1 = Coche()
    coche1.inicializar("Peugeot", "308", 2016)

    val coche2: Coche
    coche2 = Coche()
    coche2.inicializar("Ford", "Fiesta", 2014)

    println(coche1.toString())
    println(coche2.toString())
}