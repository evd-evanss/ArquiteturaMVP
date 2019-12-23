package com.sayhitoiot.cursoudemymvp.ui.frutas

/**
 * O contrato gerencia a conexão entre a camada presenter e a camada view
 */
interface FrutasContract {
    interface View{
        fun mostraDados(frutas: Array<String>)
    }
    interface Presenter{
        fun getFrutas()
    }
}