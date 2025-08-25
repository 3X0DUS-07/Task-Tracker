package com.caffellayohusseff.tasktracker


import com.caffellayohusseff.tasktracker.model.Tarea
import com.caffellayohusseff.tasktracker.model.enums.EstadoTarea
import com.caffellayohusseff.tasktracker.service.GestorTareas
import com.caffellayohusseff.tasktracker.ui.Menu
import com.caffellayohusseff.tasktracker.utils.FechaHelper


fun main() {
    val gestor = GestorTareas()
    val menu = Menu()


    val t1 = Tarea(1, "Test", "Descripción", EstadoTarea.PENDIENTE, "19/12/2024")
    val t2 = Tarea(2, "Aprender Fundamentos en Kotlin", "Descripción", fechaCreacion = FechaHelper.obtenerFechaActual())
    val t3 = Tarea(3, "Practicar Enums", "Descripción", fechaCreacion = FechaHelper.obtenerFechaActual())
    val t4 = Tarea(4, "Construir Data Classes", "Descripción", fechaCreacion = FechaHelper.obtenerFechaActual())


    gestor.agregarTarea(t1)
    gestor.agregarTarea(t2)
    gestor.agregarTarea(t3)
    gestor.agregarTarea(t4)


    gestor.cambiarEstado(2, EstadoTarea.COMPLETADA)
    gestor.cambiarEstado(3, EstadoTarea.EN_PROGRESO)
    gestor.cambiarEstado(4, EstadoTarea.COMPLETADA)


    val reporte = gestor.Reporteador().generarResumenGeneral()


    menu.imprimirLista(gestor.obtenerTareas())


    println(reporte)
}

