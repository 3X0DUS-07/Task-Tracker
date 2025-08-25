package com.caffellayohusseff.tasktracker.model

data class Categoria(
    val id: Int,
    var nombre: String,
    var descripcion: String = ""
) {
    fun mostrarInfo(): String = "$id - $nombre (${descripcion})"
}

