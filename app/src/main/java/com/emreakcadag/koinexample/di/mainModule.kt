package com.emreakcadag.koinexample.di

import com.emreakcadag.koinexample.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

/**
 * Created by Emre Akçadağ on 16.06.2020
 */

val mainModule = module {

    single(named("APP_NAME")) { "Koin Example" }

    viewModel { MainViewModel() }
}