/**
 * 0108 – Listas
 * Crea un programa que permita al usuario introducir cadenas de texto y las guarde
 * en una lista, hasta terminar con "fin" (que no se almacenará). A continuación,
 * muestra la lista en orden inverso (del último dato al primero). Finalmente,
 * muéstrala en su orden normal usando ".forEach".
 */

fun main() {
    val lista = mutableListOf<String>()

    println("Introduce cadenas de texto, \"fin\" para terminar:")
    do {
        val cadena = readln()
        if (cadena != "fin")
            lista.add(cadena)

    } while (cadena != "fin")

    for (i in lista.size - 1 downTo 0) {
        print(lista[i] + " ")
    }

    println()
    lista.forEach { print("$it ") }
}