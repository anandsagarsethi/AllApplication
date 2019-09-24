package com.anand.allapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anand.allapplication.db.DatabaseCreator
import com.anand.allapplication.db.FormDB
import com.anand.allapplication.db.ShowDB2T
import com.anand.allapplication.db.dao.ShowDB2Dao
import kotlinx.android.synthetic.main.activity_show_db2.*
import org.jetbrains.anko.doAsync

class ShowDB2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_db2)
        //val showDB2Dao= DatabaseCreator().getAppDatabase(applicationContext).ShowDB2Dao()
       val showDB2Dao = DatabaseCreator().getAppDatabase(applicationContext).showDB2Dao()



        btSubmitList2.setOnClickListener {
            submitResults(showDB2Dao)
        }

    }

    fun submitResults(showDB2Dao: ShowDB2Dao){
        doAsync {
            val ShowDB2T = ShowDB2T(txtID2.text.toString().toInt(), txtName2.text.toString(), txtDetails2.text.toString())
            showDB2Dao.insert(ShowDB2T)
        }

        this.startActivity(Intent(this,ShowDBList2::class.java))
    }
}
