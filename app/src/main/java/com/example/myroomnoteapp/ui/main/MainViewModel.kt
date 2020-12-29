package com.example.myroomnoteapp.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.example.myroomnoteapp.database.Note
import com.example.myroomnoteapp.repository.NoteRepository

class MainViewModel(application: Application): ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)
    
    fun getAllNotes(sort: String): LiveData<PagedList<Note>> = LivePagedListBuilder(mNoteRepository.getAllNotes(sort), 20).build()
}