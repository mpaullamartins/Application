package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.databinding.ActivityTelausuarioBinding


class telausuario : AppCompatActivity() {

    private lateinit var binding: ActivityTelausuarioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTelausuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // setContentView(R.layout.activity_telausuario)


    }
}