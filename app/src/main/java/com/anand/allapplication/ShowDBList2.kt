package com.anand.allapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.anand.allapplication.db.DatabaseCreator
import org.jetbrains.anko.toast

class ShowDBList2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_dblist2)
        val showDB2Dao= DatabaseCreator().getAppDatabase(applicationContext).showDB2Dao()
        showDB2Dao.getAll().let {

            Toast.makeText(this, it?.size.toString(), Toast.LENGTH_SHORT).show()
        }



    }
}
