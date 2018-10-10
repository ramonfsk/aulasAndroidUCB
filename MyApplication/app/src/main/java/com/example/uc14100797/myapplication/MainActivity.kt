package com.example.uc14100797.myapplication

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import java.net.ResponseCache

class MainActivity : Activity() {

    val url = "https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata/Moedas?format=json"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnClick.setOnClickListener{
            var nome = tvMsg.text
            textView.setText(nome)

            val que = Volley.newRequestQueue(this@MainActivity)
            val req = StringRequest(Request.Method.GET, url, Response.Listener{
                response -> textView.text = response.toString()
            }, Response.ErrorListener {
                Toast.makeText(this, "Verifique sua conexão", Toast.LENGTH_LONG).show()
            })
            que.add(req)
        }
    }

    fun convertJsonToObject(jsonString: String):Array<Mensagem>{
        var gson = Gson()
        var json = jsonString;

        val arrayMensagem = gson.fromJson(jsonString, Array<Mensagem>::class.java)

        return arrayMensagem
    }

    class Mensagem{

    }
}
