package com.anand.allapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list.*

class ActivityList : AppCompatActivity() {

    val arr = arrayOf("1","2","3","4","5","6","7","8","9","10","11","12","13","14")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val arrAdapter = ArrayAdapter<String>(this, R.layout.list_layout,R.id.txtView,arr)
        listView.adapter = arrAdapter
        listView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, arr[position],Toast.LENGTH_SHORT).show()
        }


    }
}
