package com.example.fooddeliveryapp.roomdb.repository

import androidx.lifecycle.LiveData
import com.example.fooddeliveryapp.roomdb.Note
import com.example.fooddeliveryapp.roomdb.NoteDao

class NotesRepository(private val noteDao: NoteDao) {

    val allNotes : LiveData<List<Note>> = noteDao.getAllNotes()

    suspend fun insert(note: Note){
        return noteDao.insert(note)
    }
}