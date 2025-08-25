package com.caffellayohusseff.tasktracker.model

import com.caffellayohusseff.tasktracker.model.enums.EstadoTarea

data class Tarea(
    val id: Int,
    var titulo: String,
    var descripcion: String,
    var estado: EstadoTarea = EstadoTarea.PENDIENTE,
    val fechaCreacion: String
) {

    fun cambiarEstado(nuevoEstado: EstadoTarea) {
        estado = nuevoEstado
    }

    fun mostrarInfo(): String = buildString {
        appendLine("    ID: $id")
        appendLine("    Título: $titulo")
        appendLine("    Descripción: $descripcion")
        appendLine("    Estado: ${estado.mostrarEstado()}")
        append("    Fecha de creación: $fechaCreacion")
    }

    fun mostrarResumen(): String = "#${id} • ${titulo} • ${estado.mostrarEstado()}"

    companion object {
        const val MAX_TITULO_LENGTH = 50

        fun validarTitulo(titulo: String): Boolean =
            titulo.isNotBlank() && titulo.length <= MAX_TITULO_LENGTH
    }
}
