package com.br.ricardobadan.nacrbadan

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_senso.*

class SensoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_senso)

        btCadastrar.setOnClickListener{
            carregarDados()
        }
    }

    fun carregarDados(){
        val proximaTela = Intent (this, ResultadoActivity::class.java)
        proximaTela.putExtra("nome", etNome.text.toString())
        proximaTela.putExtra("time", spTimes.selectedItem.toString())
        startActivity(proximaTela)
        finish()
    }
}
