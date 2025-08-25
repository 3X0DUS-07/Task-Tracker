package com.caffellayohusseff.tasktracker.model.enums


enum class EstadoTarea(val descripcion: String, val simbolo: String) {
    PENDIENTE("Por hacer", "⏳"),
    EN_PROGRESO("En progreso", "🔄"),
    COMPLETADA("Completada", "✅");


    fun mostrarEstado(): String = "$simbolo ${descripcion}"


    companion object {
        fun fromOrdinal(ordinal: Int): EstadoTarea? =
            if (ordinal in 0 until values().size) values()[ordinal] else null
    }
}