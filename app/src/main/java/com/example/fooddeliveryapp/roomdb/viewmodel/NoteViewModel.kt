package com.example.fooddeliveryapp.roomdb.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fooddeliveryapp.roomdb.Note
import com.example.fooddeliveryapp.roomdb.repository.NotesRepository
import kotlinx.coroutines.launch

class NoteViewModel(private val repository: NotesRepository): ViewModel() {

    val allNotes : LiveData<List<Note>> = repository.allNotes

    fun insert(note: Note) = viewModelScope.launch {
        repository.insert(note)
    }

}