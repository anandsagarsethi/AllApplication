package com.anand.allapplication.db.dao

import androidx.room.*
import com.anand.allapplication.db.FormDB


@Dao
interface FormDBDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(FormDB: FormDB)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(formDBLIST: List<FormDB>)

    @Query("SELECT * FROM FormDB WHERE id = :id")
    fun get(id: Int): FormDB?

    @Query("SELECT * FROM FormDB ORDER BY id DESC")
    fun getAll(): List<FormDB>?

    @Query("SELECT * FROM FormDB ORDER BY id DESC LIMIT :limit OFFSET :offset")
    fun getAllByOffsetAndLimit(offset: Int, limit: Int): List<FormDB>?

    @Delete
    fun delete(recording: FormDB)
}
