package com.cheezycode.quotesviewmodel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.cheezycode.quotesviewmodel.databinding.ActivityNotesBinding

class NotesActivity : AppCompatActivity() {
    lateinit var binding:ActivityNotesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_notes)

        with(binding){
            add.setOnClickListener {
                val title=titles.text.toString()
                val description=description.text.toString()

                val intent= Intent(this@NotesActivity,DeatailActivity::class.java)
                intent.putExtra("KEY", "title: $title  descrption: $description")
                startActivity(intent)
            }
        }
    }
}