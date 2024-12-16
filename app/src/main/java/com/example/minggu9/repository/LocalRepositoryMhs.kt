package com.example.minggu9.repository

import com.example.minggu9.data.dao.MahasiswaDAO
import com.example.minggu9.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

class LocalRepositoryMhs (
    private val mahasiswaDAO: MahasiswaDAO
) : RepositoryMhs {
    override fun getMhs(nim: String): Flow<Mahasiswa> {
        return mahasiswaDAO.getMahasiswa(nim = nim)
    }

    override suspend fun deleteMhs(mahasiswa: Mahasiswa) {
        mahasiswaDAO.deleteMahasiswa(mahasiswa = mahasiswa)
    }

    override suspend fun updateMhs(mahasiswa: Mahasiswa) {
        mahasiswaDAO.updateMahasiswa(mahasiswa = mahasiswa)
    }

    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDAO.insertMahasiswa(mahasiswa)
    }

    override fun getAllMahasiswa(): Flow<List<Mahasiswa>> {
        return mahasiswaDAO.getAllMahasiswa()
    }
}