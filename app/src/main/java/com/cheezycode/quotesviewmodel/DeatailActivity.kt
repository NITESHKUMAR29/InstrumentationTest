package com.cheezycode.quotesviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.cheezycode.quotesviewmodel.databinding.ActivityDeatailBinding

class DeatailActivity : AppCompatActivity() {
    lateinit var binding: ActivityDeatailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_deatail)
        with(binding){
            finalText.text=intent.getStringExtra("KEY")
        }
    }
}