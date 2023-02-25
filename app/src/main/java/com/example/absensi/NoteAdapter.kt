package com.example.absensi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.absensi.room.Note

class NoteAdapter (private val notes: ArrayList<Note>) :RecyclerView.Adapter<NoteAdapter.NoteViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        return  NoteViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.apdater_note,parent, false)
        )
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
       val note = notes[position]
    }

    override fun getItemCount() = notes.size

    class NoteViewHolder(view: View) :RecyclerView.ViewHolder(view)

    fun SetData(list: List<Note>){
        notes.clear()
        notes.addAll(list)
        notifyDataSetChanged()
    }

    }



