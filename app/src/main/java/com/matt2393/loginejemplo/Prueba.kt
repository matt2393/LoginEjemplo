package com.matt2393.loginejemplo

import android.content.Context
import android.content.Intent
import com.google.firebase.firestore.*

class Prueba {

    fun pp() {
        FirebaseFirestore.getInstance()
            .collection("Usuario")
            .whereEqualTo("usuario", "")
            .addSnapshotListener { queryDocumentSnapshots, e ->
                for (dd in queryDocumentSnapshots!!.documents) {

                }
                val ctx: Context

            }
    }
}
