package com.example.minggu9.dependenciesinjection

import android.content.Context
import com.example.minggu9.data.Database.krsDatabase
import com.example.minggu9.repository.LocalRepositoryMhs
import com.example.minggu9.repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp {
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(krsDatabase.getDatabase(context).mahasiswaDAO())
    }
}