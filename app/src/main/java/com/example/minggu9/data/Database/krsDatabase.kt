package com.example.minggu9.data.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.minggu9.data.dao.MahasiswaDAO
import com.example.minggu9.data.entity.Mahasiswa
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized

@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class krsDatabase : RoomDatabase() {

    //Mendefinisikan fungsi untuk mengatur data Mahasiswa
    abstract fun mahasiswaDAO() : MahasiswaDAO

    companion object {
        @Volatile //Memastikan bahwa nilai variable Instance selalu sama di semua thread
        private var Instances: krsDatabase?= null

        @OptIn(InternalCoroutinesApi::class)
        fun getDatabase(context: Context) : krsDatabase {
            return (Instances ?: synchronized(this) {
                Room.databaseBuilder(
                    context,
                    krsDatabase::class.java,
                    "KrsDatabase"
                )
                    .build().also { Instances = it }
            })
        }
    }
}