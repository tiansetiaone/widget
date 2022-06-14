package com.example.widget

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.widget.databinding.ActivityMainBinding

//Membuatt Variable Binding
private lateinit var binding: ActivityMainBinding
    class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Inisialisasi Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        //memanggil layout
        setContentView(binding.root)

        val getData = intent.getParcelableExtra<ModelLogin>("data")
        binding.txtUserName.text = getData?.username.toString()
        binding.txtPassword.text = getData?.password.toString()

        //Explicit intent
        binding.btnWidget.setOnClickListener {
            val intent = Intent (this, widget::class.java)
            startActivity(intent)
        }

        binding.btnIntentExplicit.setOnClickListener {
            val intent = Intent(this,ImplicitIntent::class.java)
            startActivity(intent)
        }
    }
}