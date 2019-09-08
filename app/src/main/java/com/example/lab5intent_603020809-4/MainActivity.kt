package com.example.lab5intent_6030217213

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun radio_button_click(view: View) {
        // Get the clicked radio button instance
        val radio: RadioButton = findViewById(radioGroup.checkedRadioButtonId)
        Toast.makeText(applicationContext, "On click : ${radio.text}", Toast.LENGTH_SHORT)
            .show()
    }
    fun onClickShowDetail (v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        val radio:RadioButton=findViewById(radioGroup.checkedRadioButtonId)
        intent.putExtra("stdData", Student (IDEDT.text.toString(), radio. text.toString(), nameEDT. text.toString(),
        ageEDT.text.toString().toInt()))
        startActivity(intent)
    }
    fun reset(v: View) {
        IDEDT.text.clear()
        radioGroup.clearCheck()
        nameEDT.text.clear()
        ageEDT.text.clear()

    }
}
