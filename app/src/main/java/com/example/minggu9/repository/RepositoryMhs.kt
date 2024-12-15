package com.example.minggu9.repository

import com.example.minggu9.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
    fun getAllMahasiswa() : Flow<List<Mahasiswa>>
}