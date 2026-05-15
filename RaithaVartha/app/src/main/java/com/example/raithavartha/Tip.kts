package com.yourname.raithavarta

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tips")
data class Tip(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val description: String,
    val cropCategory: String,
    val imageUrl: String,
    val language: String,
    val date: String
)