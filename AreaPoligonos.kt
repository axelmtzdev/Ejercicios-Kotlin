/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

fun main() {
    // Creamos una lista de objetos de diferentes formas geométricas (polígonos)
    val shapes = listOf(
        Triangle(10.0, 5.0),  // Triángulo con base 10 y altura 5
        Rectangle(5.0, 7.0),  // Rectángulo con longitud 5 y ancho 7
        Square(4.0)           // Cuadrado con lado de longitud 4
    )

    // Iteramos sobre cada forma en la lista y llamamos a su método printArea para imprimir el área
    shapes.forEach { it.printArea() }
}

// Definimos la interfaz Polygon que representa un polígono con métodos de área y de impresión de área
interface Polygon {
    // Método que debe calcular el área de la figura
    fun area(): Double
    
    // Método para imprimir el área de la figura, usando el nombre de la clase como tipo de figura
    fun printArea() = println("El área del ${this::class.simpleName} es ${area()}")
}

data class Triangle(val base: Double, val height: Double) : Polygon {
    
    override fun area() = (base * height) / 2
}

data class Rectangle(val length: Double, val width: Double) : Polygon {

    override fun area() = length * width 
}


data class Square(val side: Double) : Polygon {

    override fun area() = side * side 
}
