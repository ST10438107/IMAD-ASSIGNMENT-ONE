package com.example.immortalshistoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Age = findViewById<EditText>(R.id.editTextNumber)
        val Generate = findViewById<Button>(R.id.button)
        val Immortal = findViewById<TextView>(R.id.textView2)
        val Clear = findViewById<Button>(R.id.button2)
        // these are all the declared variables

        // this is the button that will Generate the history when it is pressed
        Generate?.setOnClickListener {
            if ( Age .text.toString().toInt() == 95 ){
                Immortal.text = " Nelson Rolihlahla Mandela, was a former " +
                        " President of South Africa"

            }
            else if ( Age.text.toString().toInt() == 78){
                Immortal.text = " Mahatma Ghandi , was a famous Indain Lawyer "
            }
            else if ( Age.text.toString().toInt() == 67){
                Immortal.text = " Leonardo da Vinci , was a very famous Italian Polymoth"
            }
            else if ( Age.text.toString().toInt() == 76){
                Immortal.text = " Albert Einstein , he was a Theoretical physicist"
            }
            else if ( Age.text.toString().toInt() == 39){
                Immortal.text = " Martin Luther King Jr. He was a famous" +
                        " American Minister/ Activist"
            }
            else if ( Age.text.toString().toInt() == 41){
                Immortal.text = " Shaka Zulu , was King of the Zulu Kingdom"
            }
            else if ( Age.text.toString().toInt() == 92){
                Immortal.text = " Rosa Louse Parks , she was a African American Human Activist "
            }
            else if ( Age.text.toString().toInt() == 91){
                Immortal.text = " Harriet Tubman, was a famous American " +
                        " Abolitionist/Social activist "
            }
            else if ( Age.text.toString().toInt() == 56){
                Immortal.text = " Adolf Hitler , was a famous Chancellor of German Reich"
            }
            else if ( Age.text.toString().toInt() == 90){
                Immortal.text = " Marry Church Terrell , American civil rights activist/journalist"
            }
            // these are all the famous historical figures that shall be outputted

        }



    }
}