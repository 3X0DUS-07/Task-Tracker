package com.caffellayohusseff.tasktracker

import com.caffellayohusseff.tasktracker.model.Tarea
import com.caffellayohusseff.tasktracker.model.Categoria
import com.caffellayohusseff.tasktracker.model.enums.EstadoTarea
import com.caffellayohusseff.tasktracker.model.enums.Prioridad
import com.caffellayohusseff.tasktracker.service.GestorTareas
import com.caffellayohusseff.tasktracker.ui.Menu
import com.caffellayohusseff.tasktracker.utils.FechaHelper

fun main() {
    val gestor = GestorTareas()
    val menu = Menu()

    // Crear categorías
    val cat1 = Categoria(1, "Estudio", "Tareas relacionadas con aprendizaje")
    val cat2 = Categoria(2, "Trabajo", "Tareas laborales")
    gestor.agregarCategoria(cat1)
    gestor.agregarCategoria(cat2)

    // Crear tareas
    val t1 = Tarea(1, "Test", "Descripción", EstadoTarea.PENDIENTE, "19/12/2024")
    val t2 = Tarea(2, "Aprender Fundamentos en Kotlin", "Descripción", fechaCreacion = FechaHelper.obtenerFechaActual(), prioridad = Prioridad.ALTA)
    val t3 = Tarea(3, "Practicar Enums", "Descripción", fechaCreacion = FechaHelper.obtenerFechaActual(), prioridad = Prioridad.MEDIA)
    val t4 = Tarea(4, "Construir Data Classes", "Descripción", fechaCreacion = FechaHelper.obtenerFechaActual(), prioridad = Prioridad.BAJA)

    gestor.agregarTarea(t1)
    gestor.agregarTarea(t2)
    gestor.agregarTarea(t3)
    gestor.agregarTarea(t4)

    // Asignar categorías
    gestor.asignarCategoria(2, 1)
    gestor.asignarCategoria(3, 1)
    gestor.asignarCategoria(4, 2)

    // Cambiar estados y prioridades
    gestor.cambiarEstado(2, EstadoTarea.COMPLETADA)
    gestor.cambiarEstado(3, EstadoTarea.EN_PROGRESO)
    gestor.cambiarEstado(4, EstadoTarea.COMPLETADA)
    gestor.cambiarPrioridad(3, Prioridad.ALTA)

    val reporte = gestor.Reporteador().generarResumenGeneral()
    menu.imprimirLista(gestor.obtenerTareas())
    println(reporte)
}
