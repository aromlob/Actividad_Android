package com.example.actvidadesandroid

class ClaseA {
    private var numero : Int
    private var cadena : String
    private var afirmacion : Boolean
    constructor(cadena: String, numero: Int, afirmacion: Boolean) {
        this.cadena = cadena
        this.numero = numero
        this.afirmacion = afirmacion
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
    fun getAfrimacion() : Boolean{
        return afirmacion
    }
    fun setAfirmacion(afirmacion: Boolean) : Boolean{
        return afirmacion
    }

    override fun toString(): String {
        return "ClaseA(numero=$numero, cadena='$cadena', afirmacion=$afirmacion)"
    }


}