package com.sayhitoiot.cursoudemymvp.ui.main

interface MainContract {

    interface View{

        fun mostrarMensagem(texto: String)

        fun iniciaActivityFrutas()
    }
    interface Presenter{
        // Será chamado qdo o botão de login for clicado
        fun loginClicado(nome: String, senha: String)
    }

}