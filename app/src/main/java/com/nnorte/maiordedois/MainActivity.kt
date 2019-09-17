package com.nnorte.maiordedois

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

     private var numero1 : EditText ? = null
     private var numero2 : EditText ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        numero1 = findViewById(R.id.ed_numero1)
        numero2 = findViewById(R.id.ed_numero2)
    }

    fun mostraMaiorDeDois(view : View){
        val a : Int = numero1!!.text.toString().toInt()
        val b : Int = numero2!!.text.toString().toInt()

        val maior : String = if(a > b){
            "$a e o maior."
        }
        else if(b > a){
            "$b e o maior."

        }
        else{
            "Os dois numeros sao iguais."
        }

        Snackbar.make(view,maior,Snackbar.LENGTH_INDEFINITE).show()
    }
}
