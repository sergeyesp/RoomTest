package com.example.roomtest.db

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.roomtest.model.NoteModel

@Database(entities = [NoteModel::class], version = 1)
abstract class NoteDataBase: RoomDatabase() {
}