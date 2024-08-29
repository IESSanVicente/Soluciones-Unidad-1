/**
 * 0103 – Día de la semana
 * Muestra el nombre de un día de la semana a partir de su número (del 1 al 7),
 * usando "when". El sábado y el domingo deberán aparecer como "fin de semana" y 
 * se deberá avisar si el número no es válido.
 */

fun main() {
    val x : Int = 7

    when(x){
        1 -> print("Lunes")
        2 -> print("Martes")
        3 -> print("Miercoles")
        4 -> print("Jueves")
        5 -> print("Viernes")
        6, 7 -> print("Fin de semana")
    }
}