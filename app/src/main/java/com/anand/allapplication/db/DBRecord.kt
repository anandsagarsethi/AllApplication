package com.anand.allapplication.db

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DBRecord(
    @PrimaryKey
    @NonNull
    val id: Int,
    val name: String,
    val isStarred: Boolean = false

)

