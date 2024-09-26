/**
 * 0110 – Clases II
 * Crea una clase libro (autor, título, año), con setters que dejen los valores
 * por defecto "Anónimo", "No indicado" y -1. Crea también un método que devuelva
 * los tres datos en una misma línea, comenzando por el título, separados por espacios
 * y guiones, como en "It – Stephen King – 1986".
 */

class Libro(autor: String, titulo: String, anyo: Int) {
    var autor: String = ""
        set(valor) {
            field = if (valor.isEmpty()) "Anónimo" else valor
        }
        get() = field

    var titulo: String = ""
        set(valor) {
            field = if (valor.isEmpty()) "No indicado" else valor
        }
        get() = field

    var anyo: Int = 0
        set(valor) {
            field = if (valor < 0) -1 else valor
        }
        get() = field

    init {
        this.autor = autor
        this.titulo = titulo
        this.anyo = anyo
    }

    override fun toString(): String {
        return "$titulo  - $autor - $anyo"
    }
}

fun main() {
    val libro1 = Libro("Stephen King","It",1986)
    println(libro1)

    val libro2 = Libro("","",0)
    println(libro2)
}