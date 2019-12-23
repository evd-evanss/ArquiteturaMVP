package com.sayhitoiot.cursoudemymvp.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sayhitoiot.cursoudemymvp.R
import com.sayhitoiot.cursoudemymvp.model.RepositorioSessao
import com.sayhitoiot.cursoudemymvp.ui.frutas.FrutasActivity
import kotlinx.android.synthetic.main.activity_main.*

//Injeção de dependencia de MainContract
class MainActivity : AppCompatActivity(), MainContract.View {
    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Inicializa o presenter
        presenter = MainPresenter(this, RepositorioSessao())

        btn_login.setOnClickListener(){
            val nome = edt_username.text.toString()
            val senha = edt_password.text.toString()

            presenter.loginClicado(nome, senha)

        }
    }

    override fun mostrarMensagem(texto: String) {

        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
    }

    override fun iniciaActivityFrutas() {
        startActivity(Intent(this, FrutasActivity::class.java))
    }
}
