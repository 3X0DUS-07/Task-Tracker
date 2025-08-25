package com.caffellayohusseff.tasktracker.service

import com.caffellayohusseff.tasktracker.model.Tarea
import com.caffellayohusseff.tasktracker.model.Categoria
import com.caffellayohusseff.tasktracker.model.enums.EstadoTarea
import com.caffellayohusseff.tasktracker.model.enums.Prioridad

class GestorTareas {
    private val tareas = mutableListOf<Tarea>()
    private val categorias = mutableListOf<Categoria>()

    // --- Gestión de Tareas ---
    fun agregarTarea(tarea: Tarea) {
        tareas.add(tarea)
    }

    fun cambiarEstado(idTarea: Int, nuevoEstado: EstadoTarea) {
        tareas.find { it.id == idTarea }?.cambiarEstado(nuevoEstado)
    }

    fun cambiarPrioridad(idTarea: Int, nuevaPrioridad: Prioridad) {
        tareas.find { it.id == idTarea }?.cambiarPrioridad(nuevaPrioridad)
    }

    fun obtenerTareas(): List<Tarea> = tareas

    // --- Gestión de Categorías ---
    fun agregarCategoria(categoria: Categoria) {
        categorias.add(categoria)
    }

    fun asignarCategoria(idTarea: Int, idCategoria: Int): Boolean {
        val tarea = tareas.find { it.id == idTarea }
        val categoria = categorias.find { it.id == idCategoria }
        return if (tarea != null && categoria != null) {
            tarea.categoria = categoria
            true
        } else false
    }

    // --- Reportes ---
    inner class Reporteador {
        fun generarResumenGeneral(): String {
            val pendientes = tareas.count { it.estado == EstadoTarea.PENDIENTE }
            val progreso = tareas.count { it.estado == EstadoTarea.EN_PROGRESO }
            val completadas = tareas.count { it.estado == EstadoTarea.COMPLETADA }

            return "Total: ${tareas.size} | ⏳ $pendientes | 🔄 $progreso | ✅ $completadas"
        }
    }
}
