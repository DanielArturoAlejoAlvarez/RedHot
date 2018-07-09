package com.alejo.daniel.proyectokotlin.feature

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


data class Cursos(val nombre: String, val url: String)



class AprendiendoKotlin : Activity() {

    val react = Cursos("React", "react")
    val kot = Cursos("Kotlin", "kotlin")
    val cursoDafault = kot.copy()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aprendiendo_kotlin)

        val boton = findViewById(R.id.botoncito) as Button
        boton.setOnClickListener() {
            //view -> verEnPantalla("Oh my god, you gave me click :3")
            view -> switchCurso(cursoDafault)
        }

        //verEnPantalla("${cursoDafault.nombre} A JavaScript library for building user interfaces in: ${cursoDafault.url}")
        boton.setText(todosLosCursos())
    }

    fun verEnPantalla(s: String) {
        val txt = findViewById(R.id.mensaje) as TextView
        txt.setText(s)
    }

    fun switchCurso(curso: Cursos){
        var cursoDafault = curso.copy()
        when(curso.url){
            "react" -> cursoDafault = kot.copy()
            "kotlin" -> cursoDafault = react.copy()
            else -> print("This will never happen!")
        }
        verEnPantalla("${cursoDafault.nombre} Kotlin is a great fit for developing Android applications in: ${cursoDafault.url}")
    }

    fun todosLosCursos() : String = "${react.nombre} and ${kot.nombre}"
}
