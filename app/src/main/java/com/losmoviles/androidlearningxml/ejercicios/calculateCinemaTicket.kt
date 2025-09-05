package com.losmoviles.androidlearningxml.ejercicios

/**
 * Ejercicio: Precio de entradas de cine
 *
 * Reglas de negocio:
 * - Infantil: USD 15 para edades <= 12
 * - Estándar: USD 30 para 13..60 (con descuento los lunes: USD 25)
 * - Adulto mayor: USD 20 para edades >= 61 (edad máxima considerada: 100)
 * - Fuera de especificación (edad < 0 o > 100): retorna -1
 *
 * Nota para juniors:
 * - Usamos `when` como *expresión* (retorna un valor) para mantener el código compacto y legible.
 * - Evitamos “números mágicos” dentro de `main` (aquí están explícitos por simplicidad del ejercicio);
 *   en proyectos reales conviene mover precios y límites a constantes o configuración.
 */

fun main() {
    // Casos de ejemplo para verificar cada rango:
    val child = 5     // Infantil
    val adult = 28    // Estándar (con posible descuento)
    val senior = 87   // Adulto mayor

    // Simula el día de la semana. Si es lunes, el adulto paga precio con descuento.
    val isMonday = true

    // String templates: ${...} inserta valores; para imprimir el símbolo $ se escapa como \$
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

/**
 * Calcula el precio de la entrada según edad y si es lunes.
 *
 * Decisiones de diseño:
 * - `when` sin argumento evalúa condiciones en orden (la primera que coincida gana).
 * - Se prioriza primero validar entradas fuera de especificación.
 * - Para el rango estándar (13..60), se aplica descuento sólo si `isMonday` es `true`.
 *
 * @param age        Edad del espectador. Se asume que es un entero.
 * @param isMonday   `true` si es lunes (aplica descuento para rango 13..60), de lo contrario `false`.
 * @return           Precio en USD como entero, o -1 si la edad está fuera de especificación (<0 o >100).
 */
fun ticketPrice(age: Int, isMonday: Boolean): Int =
    when {
        // 1) Validación de entrada: edades fuera del dominio permitido retornan -1
        age < 0 || age > 100 -> -1

        // 2) Precio infantil: 0..12
        age <= 12 -> 15

        // 3) Precio estándar: 13..60 (con descuento los lunes)
        age in 13..60 -> if (isMonday) 25 else 30

        // 4) Precio adulto mayor: 61..100
        else -> 20
    }
