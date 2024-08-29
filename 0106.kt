/**
 *  0106 – ¿Es primo?.
 *  Crea una función que permita saber si un cierto número, que se le pase como parámetro, es primo. Úsala desde un programa.
 */

fun esPrimo(n1: Int): Boolean {
    var contador: Int = 0;
    for (i in 1..n1) {
        if (n1 % i == 0) {
            contador++
        }
    }
    return contador <= 2
}

fun main() {
    val numero: Int = 7
    print(if (esPrimo(numero)) "El número $numero es primo" else "El número $numero NO es primo")
}