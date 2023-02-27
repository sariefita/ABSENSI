package com.example.absensi

import android.view.LayoutInflater
import android.view.OnReceiveContentListener
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.absensi.room.Note
import kotlinx.android.synthetic.main.apdater_note.view.*

class NoteAdapter (private val notes: ArrayList<Note>,private val listener: onAdaterlistener)
    :RecyclerView.Adapter<NoteAdapter.NoteViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        return  NoteViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.apdater_note,parent, false)
        )
    }

    override fun getItemCount() = notes.size

    override fun onBindViewHolder(holder: NoteViewHolder,position: Int){
        val note = notes[position]
        holder.view.tanggal.text = note.tanggal
        holder.view.tanggal.text = note.nama
        holder.view.tanggal.text = note.nis.toString().toInt().toString()
        holder.view.tanggal.text = note.kelas
        holder.view.tanggal.text = note.keterangan
        holder.view.tanggal.setOnClickListener {

            listener.onClick(note)
        }
    }

    class NoteViewHolder(val view: View) :RecyclerView.ViewHolder(view)

    fun SetData(list: List<Note>){
        notes.clear()
        notes.addAll(list)
        notifyDataSetChanged()
    }

    interface onAdaterlistener{
        fun onClick(note: Note)
    }

    }



