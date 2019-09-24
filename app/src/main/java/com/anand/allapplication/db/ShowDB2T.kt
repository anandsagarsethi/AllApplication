package com.anand.allapplication.db

import androidx.annotation.NonNull
import androidx.room.PrimaryKey
import androidx.room.Entity

@Entity
data class ShowDB2T(
    @PrimaryKey
    @NonNull
    val id: Int,
    val name: String,
    val comment: String
)