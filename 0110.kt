/**
 * 0110 – Clases II
 * Crea una clase libro (autor, título, año), con setters que dejen los valores
 * por defecto "Anónimo", "No indicado" y -1. Crea también un método que devuelva
 * los tres datos en una misma línea, comenzando por el título, separados por espacios
 * y guiones, como en "It – Stephen King – 1986".
 */

class Libro {
    var autor: String = ""
        set(valor) {
            field = if (valor.isEmpty()) "Anónimo" else valor
        }
        get() {
            return field
        }

    var titulo: String = ""
        set(valor) {
            field = if (valor.isEmpty()) "No indicado" else valor
        }
        get() {
            return field
        }

    var anyo: Int = 0
        set(valor) {
            field = if (valor < 0) -1 else valor
        }
        get() {
            return field
        }

    fun inicializar(autor: String, titulo: String, anyo: Int) {
        this.autor = autor
        this.titulo = titulo
        this.anyo = anyo
    }

    fun imprimir() {
        println("$titulo  - $autor - $anyo")
    }
}

fun main() {
    val libro: Libro
    libro = Libro()
    libro.inicializar("Stephen King","It",1986)
    libro.imprimir()

    val libro2: Libro
    libro2 = Libro()
    libro2.inicializar("","",0)
    libro2.imprimir()
}