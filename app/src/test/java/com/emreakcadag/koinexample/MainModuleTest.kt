package com.emreakcadag.koinexample

import com.emreakcadag.koinexample.di.mainModule
import junit.framework.Assert.assertNotNull
import junit.framework.Assert.assertTrue
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.core.qualifier.named
import org.koin.test.KoinTest
import org.koin.test.get
import org.koin.test.inject

/**
 * Created by Emre Akçadağ on 16.06.2020
 */
class MainModuleTest : KoinTest {

    private val appName: String by lazy { get<String>(named("APP_NAME")) }

    // Test için inject kullandık.
    private val mainViewModel: MainViewModel by inject()

    @Before
    fun setup() {
        startKoin {
            modules(listOf(mainModule))
        }
    }

    @After
    fun koinStop() {
        stopKoin()
    }

    @Test
    fun `Test APP_NAME Created`() {
        assertTrue(appName == "Koin Example")
    }

    @Test
    fun `Test MainViewModel Created`() {
        assertNotNull(mainViewModel)
    }
}