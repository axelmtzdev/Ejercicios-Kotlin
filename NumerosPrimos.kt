/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */


fun main() {
    // Recorre los números del 1 al 100 y aplica la función isPrime a cada uno
    (1..100).forEach { number ->
        if (isPrime(number)) { // Verifica si el número es primo
            println(number) // Imprime el número si es primo
        }
    } 
}

// Función para determinar si un número es primo
private fun isPrime(number: Int): Boolean {
    // Si el número es menor que 2, no es primo
    if (number < 2) {
        return false
    }
    // Recorre todos los números desde 2 hasta el número - 1
    for (i in 2 until number) {
        // Si se encuentra un divisor, el número no es primo
        if (number % i == 0) {
            return false
        }
    }
    // Si no encuentra divisores, el número es primo
    return true
}
