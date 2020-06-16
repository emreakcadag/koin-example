package com.emreakcadag.koinexample

import android.app.Application
import com.emreakcadag.koinexample.di.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

/**
 * Created by Emre Akçadağ on 16.06.2020
 */
class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@MyApplication)
            modules(listOf(mainModule))
        }
    }
}