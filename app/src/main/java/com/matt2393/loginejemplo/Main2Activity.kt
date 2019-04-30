package com.matt2393.loginejemplo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var nom:String  = intent.getStringExtra("Nombre")
        Toast.makeText(this,nom,Toast.LENGTH_LONG).show()
    }
}
