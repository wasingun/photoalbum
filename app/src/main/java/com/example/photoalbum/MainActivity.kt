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
        val catBtn2: ImageButton = findViewById(R.id.imageButton2)
        catBtn2.setOnClickListener {
            val cat2 = Intent(this, cat2::class.java)
            startActivity(cat2)
        }
        val catBtn3: ImageButton = findViewById(R.id.imageButton3)
        catBtn3.setOnClickListener {
            val cat3 = Intent(this, cat3::class.java)
            startActivity(cat3)
        }
        val catBtn4: ImageButton = findViewById(R.id.imageButton4)
        catBtn4.setOnClickListener {
            val cat4 = Intent(this, cat4::class.java)
            startActivity(cat4)
        }
        val catBtn5: ImageButton = findViewById(R.id.imageButton5)
        catBtn5.setOnClickListener {
            val cat5 = Intent(this, cat5::class.java)
            startActivity(cat5)
        }
        val catBtn6: ImageButton = findViewById(R.id.imageButton6)
        catBtn6.setOnClickListener {
            val cat6 = Intent(this, cat6::class.java)
            startActivity(cat6)
        }
    }
}