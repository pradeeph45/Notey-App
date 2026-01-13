package com.example.fooddeliveryapp.roomdb

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val name : String,
    val description : String,
    val color : Int
)
