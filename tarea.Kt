fun main() {
    println("Hello, Daniel")

    // Definición de variables
    val nombre: String = "Daniel" // Variable fija que no puede cambiar
    var edad: Int = 20         // Variable que puede cambiar su valor
    println("Nombre: $nombre, Edad: $edad")

    // Manejo de nulos
    var apellido: String = "herreño"  // No nullo
    var direccion: String? = null // Variable que puede ser nula 
    println("Dirección: $direccion")
    direccion = "Calle Falsa 123"
    println("Dirección: $direccion")

    // Opcionales
    val longitudDireccion: Int? = direccion?.length // Operador para los seguros de llamada
    println("Longitud de la dirección: $longitudDireccion")

    // Comentarios
    // Este es un comentario de una línea
    /*
     * Este es un comentario
     * de varias lineas de 
     codigo
     */

    // README.md
    val readme = """
        # Proyecto Kotlin
        Este archivo es un ejemplo de kotlin donde se encuentra:
        - la definicion de variables
        - el manejo de los nulos
        - el uso de opcionales
        - los comentarios y tipos de comentarios
    """.trimIndent()
    println(readme)
}
