package com.anand.allapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.anand.allapplication.db.DBRecord
import com.anand.allapplication.db.DatabaseCreator

class DBConnect : AppCompatActivity() {
    private val TAG = this.javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dbconnect)

        val recordingDao = DatabaseCreator().getAppDatabase(applicationContext).recordingDao()

        recordingDao.getAll()?.let {
            Log.e(TAG, it.toString())
        }

        val DBRecord = DBRecord(14, "My first recordi2ng" )
        recordingDao.insert(DBRecord)
    }
}
