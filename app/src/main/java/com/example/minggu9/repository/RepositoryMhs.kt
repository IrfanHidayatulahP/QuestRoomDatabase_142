package com.example.minggu9.repository

import com.example.minggu9.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    // get All Mahaiswa
    fun getAllMhs() : Flow<List<Mahasiswa>>

    //getMhs
    fun getMhs(nim: String) : Flow<Mahasiswa>

    //DeleteMhs
    suspend fun deleteMhs(mahasiswa: Mahasiswa)

    //UpdateMhs
    suspend fun updateMhs(mahasiswa: Mahasiswa)

    suspend fun insertMhs(mahasiswa: Mahasiswa)
    fun getAllMahasiswa() : Flow<List<Mahasiswa>>
}