package com.caffellayohusseff.tasktracker.service


import com.caffellayohusseff.tasktracker.model.Tarea
import com.caffellayohusseff.tasktracker.model.enums.EstadoTarea


/**
 * Capa de servicio: orquesta operaciones sobre Tarea.
 */
class GestorTareas {
    private val tareas = mutableListOf<Tarea>()


    fun agregarTarea(tarea: Tarea) {
        tareas.add(tarea)
    }


    fun cambiarEstado(id: Int, nuevo: EstadoTarea) {
        val t = tareas.firstOrNull { it.id == id }
        if (t != null) t.cambiarEstado(nuevo)
    }


    fun obtenerTareas(): List<Tarea> = tareas


    fun buscarPorEstado(estado: EstadoTarea): List<Tarea> = tareas.filter { it.estado == estado }


    fun limpiar() { tareas.clear() }


    /**
     * Clase interna funcional: accede a las tareas para generar un pequeño resumen.
     */
    inner class Reporteador {
        fun generarResumenGeneral(): String {
            val total = tareas.size
            val pendientes = tareas.count { it.estado == EstadoTarea.PENDIENTE }
            val progreso = tareas.count { it.estado == EstadoTarea.EN_PROGRESO }
            val completas = tareas.count { it.estado == EstadoTarea.COMPLETADA }
            return "Total: $total | ⏳ $pendientes | 🔄 $progreso | ✅ $completas"
        }
    }
}