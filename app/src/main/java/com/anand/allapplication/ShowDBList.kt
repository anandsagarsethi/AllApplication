package com.anand.allapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Toast
import com.anand.allapplication.db.DatabaseCreator
import com.anand.allapplication.db.dao.FormDBDao
import kotlinx.android.synthetic.main.activity_show_dblist.*

class ShowDBList : AppCompatActivity() {
    private val TAG = this.javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_dblist)

        val formdbDao = DatabaseCreator().getAppDatabase(applicationContext).formDBdao()
        formdbDao.getAll()?.let {
            Log.e(TAG, it.toString())

            Toast.makeText(this, it?.size.toString(),Toast.LENGTH_SHORT).show()

            val arr = mutableListOf<String>()
            for (d in it) {
                arr.add(d.name)
            }

            val arrAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arr)
            listView.adapter = arrAdapter
            listView.setOnItemClickListener { _, _, position, _ ->
                Toast.makeText(this, arr[position],Toast.LENGTH_SHORT).show()
            }
        }



    }
}
