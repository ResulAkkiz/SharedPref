package com.project.firstapp

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.prefs.AbstractPreferences
import com.project.firstapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;
    private  lateinit var sharedPreferences: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        sharedPreferences=this.getSharedPreferences("com.project.firstapp.storingdata",Context.MODE_PRIVATE)
        val userAge=sharedPreferences.getInt("age",-1);

        if (userAge != -1){
            binding.textView.text="Your Age :"
        }else{
            binding.textView.text="Your Age : $userAge"
        }

    }

    fun save(view:View) {
        print("save metot tetiklendi")
        val myAge=binding.editText.text.toString().toIntOrNull()
        if (myAge !=null){
            sharedPreferences.edit().putInt("age",myAge).apply()
            binding.textView.text="Your Age : $myAge"
        }

    }

    fun delete(view:View) {
        sharedPreferences.edit().remove("age").apply()

    }


   /* fun change(view: View){
        val isim=nameText.text.toString()
        val soyisim=surnameText.text.toString()
        val meslek=jobText.text.toString()
        val yas=ageText.text.toString()
        result.text="$isim, $soyisim, $meslek, $yas";

    }*/

}