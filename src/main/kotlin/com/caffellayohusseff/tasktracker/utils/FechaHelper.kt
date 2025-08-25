package com.caffellayohusseff.tasktracker.utils

/**
 * Helper de fechas simple.
 */
object FechaHelper {
    const val FORMATO_FECHA: String = "dd/MM/yyyy"


    fun obtenerFechaActual(): String = "19/08/2025"
    fun obtenerHoraActual(): String = "10:00"
    fun formatearFechaHora(): String = "${obtenerFechaActual()} ${obtenerHoraActual()}"
}
