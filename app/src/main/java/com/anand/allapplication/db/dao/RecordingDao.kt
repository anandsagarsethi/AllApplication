package com.anand.allapplication.db.dao

import androidx.room.*
import com.anand.allapplication.db.DBRecord
import com.anand.allapplication.db.FormDB

@Dao
interface RecordingDao {


@Insert(onConflict = OnConflictStrategy.REPLACE)
fun insert(recording: DBRecord)

@Insert(onConflict = OnConflictStrategy.REPLACE)
fun insertAll(recordingList: List<DBRecord>)

@Query("SELECT * FROM DBRecord WHERE id = :id")
fun get(id: Int): DBRecord?

@Query("SELECT * FROM DBRecord ORDER BY id DESC")
fun getAll(): List<DBRecord>?

@Query("SELECT * FROM DBRecord ORDER BY id DESC LIMIT :limit OFFSET :offset")
fun getAllByOffsetAndLimit(offset: Int, limit: Int): List<DBRecord>?

@Delete
fun delete(recording: DBRecord)
}

