/**
 * 0104 – Tabla de multiplicar
 * Escribe la tabla de multiplicar de un número introducido por el usuario, utiliza el bucle for.
 */

fun main() {
    print("Dime el número que quieres multiplicar: ")
    val n1 = readLine()!!.toInt()

    for (n2 in 1..10) {
        println("$n1 * $n2 = ${n1 * n2}")
    }
}