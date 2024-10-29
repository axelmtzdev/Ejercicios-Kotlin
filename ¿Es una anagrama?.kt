/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

fun main() {
    val result=isAnAnagrama("roma","amor")
    val texto = "arbol"
    val texto2 = "bolre"
    println(texto.lowercase().toCharArray().sortedArray())
    println(texto2.lowercase().toCharArray().sortedArray())
    println(result)
}

private fun isAnAnagrama(text1:String, text2:String): Boolean{
    
    if(text1.length != text2.length) return false
    
    return text1.lowercase().toCharArray().sortedArray().contentEquals(text2.lowercase().toCharArray().sortedArray())
