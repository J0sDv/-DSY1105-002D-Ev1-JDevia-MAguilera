package com.example.lavexpress

open class LavExpressException(mensaje: String) : Exception(mensaje)

class CodigoInvalidoException(mensaje: String) : LavExpressException(mensaje)
class TarifaInvalidaException(mensaje: String) : LavExpressException(mensaje)
class MaquinaNoEncontradaException(mensaje: String) : LavExpressException(mensaje)
class CapacidadAgotadaException(mensaje: String) : LavExpressException(mensaje)
