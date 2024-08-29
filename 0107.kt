/**
 * 0107 – Array.
 * Prepara un array con los días de la semana. El usuario introducirá un número del 1 al 7
 * y le mostrarás el día correspondiente. Si introduce un valor incorrecto, le mostrarás 
 * los 7 valores aceptables ("1 = lunes", etc).
 */

fun main() {
    val semana = arrayOf(
        "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
    )

    print("Dime un día de la semana como número: ")
    val n1 = readln().toInt()

    if (n1 <= semana.size) println(semana.get(n1 - 1)) else
        for (i in 1..semana.size)
            println("$i = ${semana.get(i - 1)}")
}