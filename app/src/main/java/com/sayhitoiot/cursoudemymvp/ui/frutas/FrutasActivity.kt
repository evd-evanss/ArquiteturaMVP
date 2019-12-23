package com.sayhitoiot.cursoudemymvp.ui.frutas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.sayhitoiot.cursoudemymvp.R
import com.sayhitoiot.cursoudemymvp.model.RepositorioFrutas

class FrutasActivity : AppCompatActivity(), FrutasContract.View {

    private lateinit var presenter: FrutasPresenter

    private lateinit var mAdapter: ArrayAdapter<String>
    private  lateinit var lista: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frutas)
        //Conecto o presenter a camada de visualização
        presenter = FrutasPresenter(this, RepositorioFrutas())

        lista = findViewById<ListView>(R.id.lista_frutas)

        // carregar as frutas
        presenter.getFrutas()

    }

    override fun mostraDados(frutas: Array<String>) {
        mAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,
            android.R.id.text1, frutas)
        lista.adapter = mAdapter

//        frutas.forEach {fruta->
//            mAdapter.add(fruta)
//        }
    }
}
