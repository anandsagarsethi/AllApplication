package com.anand.allapplication.db.dao

import androidx.room.*

import com.anand.allapplication.db.ShowDB2T


@Dao
interface ShowDB2Dao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(recording: ShowDB2T)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(recordingList: List<ShowDB2T>)

    @Query("SELECT * FROM ShowDB2T WHERE id = :id")
    fun get(id: Int): ShowDB2T?

    @Query("SELECT * FROM ShowDB2T ORDER BY id DESC")
    fun getAll(): List<ShowDB2T>?

    @Query("SELECT * FROM ShowDB2T ORDER BY id DESC LIMIT :limit OFFSET :offset")
    fun getAllByOffsetAndLimit(offset: Int, limit: Int): List<ShowDB2T>?

    @Delete
    fun delete(recording: ShowDB2T)
}
