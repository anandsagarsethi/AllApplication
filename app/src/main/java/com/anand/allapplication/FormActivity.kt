package com.anand.allapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anand.allapplication.db.DatabaseCreator
import com.anand.allapplication.db.FormDB
import com.anand.allapplication.db.dao.FormDBDao
import kotlinx.android.synthetic.main.activity_form.*
import org.jetbrains.anko.doAsync

class FormActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        val forminput = DatabaseCreator().getAppDatabase(applicationContext).formDBdao()

        btSubmit.setOnClickListener {
            submitResults(forminput)
        }
        btShowList.setOnClickListener {
            this.startActivity(Intent(this,ShowDBList::class.java))
        }




    }

    fun submitResults(forminput: FormDBDao) {


        doAsync {
            val formDB = FormDB(txtID.text.toString().toInt(), txtName.text.toString())
            forminput.insert(formDB)
        }

        this.startActivity(Intent(this,ShowDBList::class.java))


    }
}
