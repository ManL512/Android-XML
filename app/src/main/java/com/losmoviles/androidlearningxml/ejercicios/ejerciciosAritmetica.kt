package com.losmoviles.androidlearningxml.ejercicios

fun main() {
//    ej1(n = 4)
//    ej2(n = 98)
//    ej3(a = 7, b = 3)
//    ej4(edad = 90)
//    ej5(tieneInvitacion = false, esVIP = false)
//    ej6(true)
//    ej7(2023)
//    ej8(22,1,48)
//    ej9(10,5)
//    ej11(6,2,3)
//    ej12("123456789!*Ml")
    val morningNotification = 51
    val eveningNotification = 142

    printNotificationSummary(morningNotification)
    println("")
    printNotificationSummary(eveningNotification)


}


fun ej1(n: Int){
    println("Dado un entero n, imprime \"PAR\" si n % 2 == 0, si no \"IMPAR\". \n")

    if((n % 2) == 0){
        println("par")
    }
    else{
        println("impar")
    }
}

fun ej2(n: Int){
    println("Dado n: Int, imprime \"NEGATIVO\", \"CERO\" o \"POSITIVO\" \n")
    if (n > 0){
        println("numero natural positivo")
    }
    if (n < 0){
        println("numero natural negativo")
    }
    if (n == 0){
        println("numero es cero")
    }
}

fun ej3 (a: Int, b: Int){
    println("Calculadora básica")

    var suma = a+b
    var resta = a-b
    var multiplicacion = a*b
    var division = a/b
    var residuo = a%b

    val resultados = arrayOf(suma,resta,multiplicacion,division,residuo)
    for ((index,element) in resultados.withIndex()) {
        var operationName = ""
        if (index == 0) {
            operationName = "suma"
        }
        if (index == 1) {
            operationName = "resta"
        }
        if (index == 2) {
            operationName = "multiplicacion"
        }
        if (index == 3) {
            operationName = "division"
        }
        if (index == 4) {
            operationName = "residuo"
        }
        println("El resultado de la $operationName de $a y $b es:  $element")
    }

}

fun ej4(edad: Int){
    println("Dado edad: Int, imprime true si edad está en [18,65], si no false.")
    print("el numero es $edad, por lo tanto, es ${edad >=18 && edad<= 65}")
}
fun ej5(tieneInvitacion: Boolean, esVIP: Boolean){
    println("Con tieneInvitacion: Boolean y esVIP: Boolean, imprime \"ENTRA\" si cualquiera es true, en caso contrario \"NO ENTRA\".")
    if (tieneInvitacion || esVIP){
        println("tiene invitacion: ${tieneInvitacion}")
        println("es un vip: ${esVIP}")
        println("entra")
    }
    else{
        println("tiene invitacion: ${tieneInvitacion}")
        println("es un vip: ${esVIP}")
        println("no entra")
    }
}

fun ej6(bloqueado: Boolean){
    if (bloqueado){
        println("Se encuentra bloqueado")
    }
    else{
        println("No se encuentra bloqueado")
    }
}

fun ej7(año: Int){
    println("Año bisiesto (combinación aritmética + lógica)")

    var esBisiesto: Boolean = false

    if ((año % 400 == 0) || (año % 4 == 0 && año % 100 != 0)) {
        var esBisiesto = true
        println("$esBisiesto, es bisiesto")
    }
    else{
        println("$esBisiesto, no es bisiesto")
    }
}
// Ejercicio 8: solucion de IA
//fun mayorDeTres(a:Int,b:Int,c:Int)= maxOf(a,b,c)

/**
 * Ejercicio 8: Solucion personal
 */
fun ej8(a: Int, b: Int,c: Int){
    println("Ejercicio mayor de tres")

    if ((a > b) && (a>c) ){
        println("el numero mayor es: $a")
    }
    if ((b> a) && (b>c)){
        println("el numero mayor es: $b")
    }
    if ((c> a) && (c>b)){
        println("el numero mayor es: $c")
    }
}

//ejercicio 9: solucion de IA
//fun divisionSegura(a:Int,b:Int)= if (b != 0) (a / b).toString() else "DIVISION_POR_CERO"
fun ej9(a: Int, b: Int){
    if (a != 0){
        println("la division de $a / $b da como resultado: ${a/b}")
    }
    else{
        println("numero ingresado es cero, no se puede hacer division segura")
    }
}


fun ej11(a: Int, b: Int,c: Int){
    if (((a*b + c) >12 && !(( (b+c) <= 4) || a%2 ==0))){
       var resultado = true
        println("Resultado booleano correcto ")
    }
    else{
        var resultado = false
        println("Resultado booleano incorrecto ")
    }
}

fun ej12(password: String){
    if ((password.length >= 8) && (password.any() {it.isDigit()}) && (password.any() {it.isUpperCase()})){
        println("password segura")
    }
    else{
        println("password insegura!")
    }
}

fun printNotificationSummary(numberOfMessages: Int){

    if (numberOfMessages < 100){
        print("la cantidad de notificaciones es: $numberOfMessages")
    }
    else{
        print("Tu celular tiene demasiadas notificaciones pendientes: Asciende a +99 notificaciones pendientes.")
    }
}