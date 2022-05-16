package com.example.deliberydarwin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.deliberydarwin.databinding.ActivityMainBinding
import com.example.deliberydarwin.interface_user.Principal

class MainActivity : AppCompatActivity() {
    private lateinit var views: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views = ActivityMainBinding.inflate(layoutInflater)
        setContentView(views.root)
        initializacionListener()
    }

    private fun initializacionListener() {
        //views.buttonLoggin.setOnClickListener{
        //var palabras = views.editTextTextPersonName.text ; views.editTextTextPassword.text
        //Toast.makeText(this,resources.getString(R.string.user)+" : " + views.editTextTextPersonName.text + "\n"
        //+ resources.getString(R.string.password)+ " : " + views.editTextTextPassword.text, Toast.LENGTH_SHORT).show()
        views.buttonLoggin.setOnClickListener {
            val user = views.editTextTextPersonName.text.toString()
            val password = views.editTextTextPassword.text.toString()
            user?.let {
                password?.let { itp ->
                    if (it.equals("andres") && itp.equals("12345")) {
                        Principal(user)
                    }
                }
            }
        }
    }

    private fun Principal(user: String) {
        var intent = Intent(this, Principal::class.java)
        intent.putExtra("name_user", user)
        startActivity(intent)
    }

}
