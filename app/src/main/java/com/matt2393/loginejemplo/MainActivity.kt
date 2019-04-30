package com.matt2393.loginejemplo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputEditText
import android.widget.TextView
import com.google.firebase.firestore.EventListener
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {
    var user : TextInputEditText? =null
    var pass: TextInputEditText? =null
    var entrar: TextView? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user= findViewById(R.id.usuario)
        pass =  findViewById(R.id.password)
        entrar = findViewById(R.id.entrar)


        entrar!!.setOnClickListener{ v ->
            login(user!!.text.toString(),pass!!.text.toString())
        }



    }

    private fun login(us: String, pass: String){
        FirebaseFirestore.getInstance()
            .collection("Usuario")
            .whereEqualTo("usuario",us)
            .addSnapshotListener{querySnapshot, e ->

                val pp:String = querySnapshot!!.documents.get(0).get("password") as String
                val nn:String = querySnapshot!!.documents.get(0).get("nombre") as String
                if(pass.equals(pp)){
                    var intent:Intent = Intent(this,Main2Activity::class.java)
                    intent.putExtra("Nombre",nn)
                    startActivity(intent)
                }
            }
    }
}
