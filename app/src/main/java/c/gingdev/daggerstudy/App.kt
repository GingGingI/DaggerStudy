package c.gingdev.daggerstudy

import android.app.Application
import android.content.Context
import c.gingdev.daggerstudy.component.BasicNetworkComponent
import c.gingdev.daggerstudy.component.DaggerBasicNetworkComponent
import c.gingdev.daggerstudy.module.basic.AppModule
import c.gingdev.daggerstudy.module.network.NetworkModule
import c.gingdev.daggerstudy.module.network.PreferenceModule

class App: Application() {
//    Basic App Module
    val NetworkModule: BasicNetworkComponent by lazy {
        DaggerBasicNetworkComponent.builder()
            .networkModule(NetworkModule())
            .preferenceModule(PreferenceModule())
            .appModule(AppModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
    }

    companion object {
        fun getNetworkComponent(context: Context): BasicNetworkComponent {
            return (context.applicationContext as App).NetworkModule
        }
    }
}