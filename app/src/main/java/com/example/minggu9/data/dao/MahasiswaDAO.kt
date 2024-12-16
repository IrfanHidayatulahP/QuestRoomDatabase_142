package com.example.minggu9.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.minggu9.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

@Dao
interface MahasiswaDAO {
    // Fungsi get all data
    @Query("select * from mahasiswa ORDER BY nama ASC")
    fun getAllMahasiswa() : Flow<List<Mahasiswa>>

    @Query("select * from mahasiswa where nim = :nim")
    fun getMahasiswa(nim: String): Flow<Mahasiswa>

    @Insert
    suspend fun insertMahasiswa(
        mahasiswa: Mahasiswa
    )

    @Delete
    suspend fun deleteMahasiswa(mahasiswa: Mahasiswa)

    @Update
    suspend fun updateMahasiswa(mahasiswa: Mahasiswa)
}