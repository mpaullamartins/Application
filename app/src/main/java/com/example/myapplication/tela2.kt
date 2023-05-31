package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.myapplication.databinding.ActivityTela2Binding

class tela2 : AppCompatActivity() {

    private lateinit var binding: ActivityTela2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTela2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val buttonEnv = findViewById<Button>(R.id.buttonEnv)
        buttonEnv.setOnClickListener {
            // código para realizar o cadastro

            val toast = Toast.makeText(
                applicationContext,
                "Successful registration!",
                Toast.LENGTH_SHORT
            )
            toast.show()

        }
    }
}