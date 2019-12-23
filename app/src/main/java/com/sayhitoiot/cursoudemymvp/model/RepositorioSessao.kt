package com.sayhitoiot.cursoudemymvp.model

class RepositorioSessao {
    val nome = "evd_evanss"
    val senha = "sophia26"

    fun login(mNome: String, mSenha: String): Boolean{

        return mNome.equals(nome)&&
                mSenha.equals(senha)

    }
}