package com.example.cursoandroid

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class WhatsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_whats)

        val botaoOla: Button = findViewById(R.id.whats_btn_ola)
        val botaoTchau: Button = findViewById(R.id.whats_btn_tchau)

        var message1: String = "Olá, tudo bem? Esta mensagem foi enviada através do meu aplicativo Android!"
        var message2: String = "Até mais, foi um prazer te conhecer!"

        botaoOla.setOnClickListener {
            val intent = Intent()
                .setAction(Intent.ACTION_SEND)

            intent.putExtra(Intent.EXTRA_TEXT, message1)

            intent.setType("text/plain")       
            intent.setPackage("com.whatsapp")
            startActivity(intent)
        }

        botaoTchau.setOnClickListener {
            val intent = Intent()
                .setAction(Intent.ACTION_SEND)

            intent.putExtra(Intent.EXTRA_TEXT, message2)

            intent.setType("text/plain")
            intent.setPackage("com.whatsapp")
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "onStart()")
    }
}