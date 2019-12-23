package com.sayhitoiot.cursoudemymvp.ui.main

import com.sayhitoiot.cursoudemymvp.model.RepositorioSessao

//A camada presenter tem como inicialização uma dependencia da camada de visualização
class MainPresenter(private val view: MainContract.View, private val repositorioSessao: RepositorioSessao) : MainContract.Presenter {

    //private var repositorioSessao = RepositorioSessao()
    override fun loginClicado(nome: String, senha: String) {

        if(nome.isEmpty()){
            view.mostrarMensagem("Nome inválido!")
           return
        }
        if(senha.isEmpty()){
            view.mostrarMensagem("Digite uma senha!")
            return
        }

        //-------------
        val loginSucesso = repositorioSessao.login(nome, senha)
        if(loginSucesso){
            view.mostrarMensagem("login efetuado!")
            view.iniciaActivityFrutas()
        }else{
            view.mostrarMensagem("falha no loggin")
        }
    }


}