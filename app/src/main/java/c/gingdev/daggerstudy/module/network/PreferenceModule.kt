package c.gingdev.daggerstudy.module.network

import android.app.Application
import c.gingdev.daggerstudy.`object`.SettingPreference
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PreferenceModule {
    @Provides
    @Singleton
    fun provideSettingPreference(app: Application): SettingPreference {
        return SettingPreference(app)
    }
}