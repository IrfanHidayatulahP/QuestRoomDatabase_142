package com.example.minggu9

import android.app.Application
import com.example.minggu9.dependenciesinjection.ContainerApp

class KrsApp : Application() {
    //Fungsinya untuk menyimpan instance ContainerApp
    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()
        //Membuat instance ContainerApp
        containerApp = ContainerApp(this)
        //instance adlaah object yang dibuat dari class
    }
}