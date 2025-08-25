package com.caffellayohusseff.tasktracker.model.enums

enum class Prioridad(val descripcion: String, val simbolo: String) {
    BAJA("Baja", "🟢"),
    MEDIA("Media", "🟡"),
    ALTA("Alta", "🔴");

    fun mostrarPrioridad(): String = "$simbolo $descripcion"

    companion object {
        fun fromOrdinal(ordinal: Int): Prioridad? =
            if (ordinal in 0 until values().size) values()[ordinal] else null
    }
}
