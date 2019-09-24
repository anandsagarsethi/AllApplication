package com.anand.allapplication.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.anand.allapplication.db.dao.*


@Database(entities = [DBRecord::class, FormDB::class, ShowDB2T::class], version = 4)
abstract class AppDatabase: RoomDatabase() {

    abstract fun recordingDao(): RecordingDao
    abstract fun formDBdao(): FormDBDao
    abstract fun showDB2Dao(): ShowDB2Dao



}