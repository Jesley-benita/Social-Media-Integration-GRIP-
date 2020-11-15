package com.example.myyoutube

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView


class extra : AppCompatActivity() {
    lateinit var linkedinbtn:ImageButton
    lateinit var facebookbtn:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extra)
        facebookbtn = findViewById(R.id.facebookbtn)
        linkedinbtn = findViewById(R.id.linkedinbtn)
        linkedinbtn.setOnClickListener(){
            val intent= Intent(this@extra,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
        facebookbtn.setOnClickListener(){
            val intent= Intent(this@extra,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
    }
}