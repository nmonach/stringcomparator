package com.curso.android.app.practica.stringcomparator.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.curso.android.app.practica.stringcomparator.R
import com.curso.android.app.practica.stringcomparator.model.StringComparatorModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private val stringComparatorModel = StringComparatorModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)

        // Inicializo el ViewModel
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        val string1 = findViewById<EditText>(R.id.string1)
        val string2 = findViewById<EditText>(R.id.string2)
        val buttonCompare = findViewById<Button>(R.id.comparate)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        buttonCompare.setOnClickListener {
            // Obtenngo el texto ingresado en los EditText
            viewModel.text1 = string1.text.toString()
            viewModel.text2 = string2.text.toString()

            // Comparo los textos utilizando la clase StringComparatorModel
            val result = stringComparatorModel.compareStrings(viewModel.text1, viewModel.text2)

            // Comparo los textos
            val resultText = if (result) {
                "Coinciden"
            } else {
                "No Coinciden"
            }

            // Muestro el resultado en el TextView
            textViewResult.text = resultText
        }
    }
}
