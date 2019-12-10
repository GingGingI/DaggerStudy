package c.gingdev.daggerstudy.module.basic

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/***
 * 기본 Context를 주입받기위한 AppModule
 * */

@Module
class AppModule(private val app: Application) {
    @Provides
    @Singleton
    fun provideApp() = app
}