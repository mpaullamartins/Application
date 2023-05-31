package com.example.myapplication

import android.content.Intent
import android.content.IntentSender.SendIntentException
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)


        binding.textregistro.setOnClickListener {
            // código para mudar de tela clicando nome
            val textRegist = Intent(this, tela2::class.java)

            startActivity(textRegist)



        }
        val buttEnviar = binding.buttEnviar
        buttEnviar.setOnClickListener {
            val intent = Intent(this, telausuario::class.java)
            startActivity(intent)
        }



    }
}







