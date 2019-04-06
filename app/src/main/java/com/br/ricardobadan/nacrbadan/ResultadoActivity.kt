package com.br.ricardobadan.nacrbadan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        tvNomeEscolhido.text = intent.extras.getString("nome")
        tvTimeEscolhido.text = intent.extras.getString("time")
    }
}
