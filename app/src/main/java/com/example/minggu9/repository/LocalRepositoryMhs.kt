package com.example.minggu9.repository

import com.example.minggu9.data.dao.MahasiswaDAO
import com.example.minggu9.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

class LocalRepositoryMhs (
    private val mahasiswaDAO: MahasiswaDAO
) : RepositoryMhs {
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDAO.insertMahasiswa(mahasiswa)
    }

    override fun getAllMahasiswa(): Flow<List<Mahasiswa>> {
        return mahasiswaDAO.getALlMahasiswa()
    }
}