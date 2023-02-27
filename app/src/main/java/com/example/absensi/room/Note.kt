package com.example.absensi.room

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Note (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val tanggal: String,
    val nama: String,
    val nis: Int,
    val kelas: String,
    val keterangan: String
)