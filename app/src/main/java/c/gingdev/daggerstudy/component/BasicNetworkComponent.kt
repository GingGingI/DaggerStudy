package c.gingdev.daggerstudy.component

import c.gingdev.daggerstudy.`object`.SettingPreference
import c.gingdev.daggerstudy.module.basic.AppModule
import c.gingdev.daggerstudy.module.network.NetworkModule
import c.gingdev.daggerstudy.module.network.PreferenceModule
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    PreferenceModule::class,
    NetworkModule::class])
interface BasicNetworkComponent {
    fun retrofit(): Retrofit
    fun setting(): SettingPreference
}