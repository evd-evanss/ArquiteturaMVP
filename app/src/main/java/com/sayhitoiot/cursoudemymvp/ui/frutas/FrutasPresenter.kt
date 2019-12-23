package com.sayhitoiot.cursoudemymvp.ui.frutas

import com.sayhitoiot.cursoudemymvp.model.RepositorioFrutas

/**
 * Na Camada presenter nunca podemos ter dependencias ou pacotes que referenciam a camada de visualização
 */

class FrutasPresenter(private val view: FrutasContract.View,private val repositorioFrutas: RepositorioFrutas): FrutasContract.Presenter{

    //repositorioFrutas = RepositorioFrutas()

    override fun getFrutas() {
        val frutas = repositorioFrutas.getFrutas()
        frutas.sortBy { it.length } //ordenar pelo tamanho de caracteres
        view.mostraDados(frutas)
    }
//A camada presenter n funciona sem uma camada de visualização, por isso a necessidade de criar a dependencia view no construtor

}