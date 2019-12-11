package c.gingdev.daggerstudy.module.network

import android.app.Application
import c.gingdev.daggerstudy.App
import c.gingdev.daggerstudy.`object`.SettingPreference
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PreferenceModule {
    @Provides
    @Singleton
    fun provideSettingPreference(app: App): SettingPreference {
        return SettingPreference(app)
    }
}