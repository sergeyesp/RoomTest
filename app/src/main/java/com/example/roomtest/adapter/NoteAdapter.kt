package com.example.roomtest.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.roomtest.model.NoteModel

class NoteAdapter: RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {

    var listNote = emptyList<NoteModel>()
    class NoteViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {

    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {

    }
}