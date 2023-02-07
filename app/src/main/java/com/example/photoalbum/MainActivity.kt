package com.example.photoalbum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import kotlinx.coroutines.joinAll


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val catBtn: ImageButton = findViewById(R.id.imageButton1)

        catBtn.setOnClickListener {
            val cat1 = Intent(this, cat1::class.java)
            startActivity(cat1)
        }
    }
}