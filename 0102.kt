/**
 * 0102 – ¿Par?
 * Indica si un número es par o impar, usando la sintaxis de if como expresión, en vez la sintaxis clásica.
 */

fun main() {
    val n1 : Int = 3
    print(if(n1 % 2 == 0) "Es par" else "Es impar")
}