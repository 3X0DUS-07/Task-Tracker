package com.caffellayohusseff.tasktracker.ui


import com.caffellayohusseff.tasktracker.model.Tarea


/**
 * Capa UI mínima para formatear impresión en consola.
 */
class Menu {
    fun imprimirLista(tareas: List<Tarea>) {
        println("Lista de tareas:\n")
        val impresora = Impresora()
        for (t in tareas) {
            println(impresora.formatear(t))
            println("----------------------------------------------------")
        }
    }


    /** Clase interna que accede a la instancia de Menu si fuese necesario */
    inner class Impresora {
        fun formatear(t: Tarea): String = t.mostrarInfo()
    }
}