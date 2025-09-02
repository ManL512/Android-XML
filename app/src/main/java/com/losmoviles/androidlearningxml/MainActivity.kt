package com.losmoviles.androidlearningxml

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

fun main() {
    var city = "Bucaramanga" // mutable
    val birth_year = 2000 //no mutable, 'val' es un tipo de dato constante de toda la vida
    city = "Bogotá"
    println("$city - $birth_year")

    println("2) Tipos explícitos e inferencia:")

    var nombre: String
    var edad: Int
    var altura: Double
    var pais: String
    var esEstudiante: Boolean
    var promedio: Int

    nombre = "javier"
    edad = 40
    altura = 1.84
    pais = "Colombia"
    esEstudiante = false
    promedio = 4

    println("${nombre}, ${edad}, ${altura}, ${pais}, ${esEstudiante}, ${promedio}")

    println("3) Comprobación de tipos con is:")

    fun ejercicio3() {
        val n = 7
        val pi = 3.14
        val saludo = "Hola"

        println(n is Int) //true
        println(pi is Double) //true
        println(saludo is String) //true
    }
    println(ejercicio3())

    fun ejercicio4(){
        val nombre = "Miguel"
        var edad = 24
        println("Hola, ${nombre}, en 2 yrs tendras ${edad+2} yrs")
    }
    println(ejercicio4())

    fun ejercicio5(){
        //forma 1: con escapes
        println("Ella dijo: \"kotlin es genial\"\nFin de la cita")
        print("")
        //forma 2: raw string
        val texto = """
            Ella dijo: "Kotlin es genial"
            Fin de la cita.
        """.trimIndent()

        print(texto)
    }
    print(ejercicio5())

    println("6) Aritmética + template con dos decimales: ")

    fun ejercicio6(){
        var precio: Int = 200

        var descuento: Double
        descuento = 0.15

        var final: Double
        final = precio * (1-descuento)
        //final = precio * (0.85)
        //final = precio - (precio*descuento)

        println("precio final es: ${final}")
    }
    println(ejercicio6())

    println("7) Conversión de tipos (toInt, toDouble)")
    fun ejercicio7(){

        val numero42String: String = "42"

        val numero42Int = numero42String.toInt()

        println("La respuesta es ${numero42Int + 8}")
    }
    ejercicio7()

    println("8) Char vs String: ")
    // Resuelto con ayuda
    fun ejercicio8() {
        val inicial: Char = 'M' //Char es un tipo de dato con un unico caracter y se declara con comilla simple
        val palabra: String = "M" //String, por el contrario, es una cadena de caracteres concatenados
        var charIsString: Boolean = inicial is String

        println("Char es String ${charIsString}")
        println("Char: $inicial")
        println("String length: ${palabra.length}")
    }
    ejercicio8()

    fun ejercicio9(){
        var contador = 10
        contador += 5 // se suma 5
        contador -= 3 // se resta 3
        contador += 10 // suma 10
        contador = contador - 1
        contador++
        //se imprime resultado final, 22
        println(contador)
    }
    ejercicio9()

    println("10) Literales legibles con guiones bajos")


}

fun main2(){
    val poblacion: Int = 50_123_456
    val presupuesto: Double =  1_200_000.00

    println("la poblacion total es: ${poblacion}")
    println("la poblacion total es: ${presupuesto}")
}



