/*
 * Crea un programa que invierta el orden de una cadena de texto.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

fun main() {
    println(reverse("Hola mundo"))  // Llama a la función reverse con la cadena "Hola mundo" y imprime el resultado
}

private fun reverse(text: String): String {
    val textCount = text.count() - 1  // Obtiene la longitud de la cadena menos uno (índice del último carácter)
    var reversedText = ""  // Inicializa una cadena vacía para almacenar el texto invertido
    for (index in 0..textCount) {  // Itera desde 0 hasta el índice del último carácter
        reversedText += text[textCount - index]  // Agrega el carácter de la posición inversa a reversedText
    }
    return reversedText  // Devuelve la cadena invertida
}
