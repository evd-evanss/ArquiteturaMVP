package com.sayhitoiot.cursoudemymvp.model

class RepositorioFrutas {
    private val frutas = arrayOf(
        "Banana",
        "Manga",
        "Pera",
        "Pêssego"
    )

    fun getFrutas(): Array<String>{
        return frutas
    }
}