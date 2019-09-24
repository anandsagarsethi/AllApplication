package com.anand.allapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt1.setOnClickListener {

            var i = Intent(this,Activity2::class.java)
            this.startActivity(i)


        }
        btList.setOnClickListener {
            this.startActivity(Intent(this,ActivityList::class.java))
        }

        btButtons.setOnClickListener {
            this.startActivity(Intent(this, MoreButtons::class.java))
        }
        btDBConnect.setOnClickListener {
            this.startActivity(Intent(this, DBConnect::class.java))
        }
        btDBForm.setOnClickListener {
            this.startActivity(Intent(this,FormActivity::class.java))
        }
        btDBForm2.setOnClickListener {
            this.startActivity(Intent(this,ShowDB2::class.java))
        }


    }
}
