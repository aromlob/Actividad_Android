package com.example.actvidadesandroid

class ClaseA {
    private var numero : Int
    private var cadena : String

    constructor(cadena: String, numero: Int) {
        this.cadena = cadena
        this.numero = numero
    }
    fun getNumero() : Int{
        return numero
    }
    fun setNumero(numero: Int) : Int{
        return numero
    }
    fun getCadena() : String{
        return cadena
    }
    fun setCadena(cadena: String) : String{
        return cadena
    }
    override fun toString(): String {
        return "ClaseA(numero=$numero, cadena='$cadena')"
    }

}