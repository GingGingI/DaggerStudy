package c.gingdev.daggerstudy.component

import android.content.Context
import c.gingdev.daggerstudy.MainActivity
import c.gingdev.daggerstudy.annotation.UserScope
import c.gingdev.daggerstudy.module.basic.ActivityModule
import c.gingdev.daggerstudy.module.test.testModule
import dagger.Component
import javax.inject.Singleton

@UserScope
@Component(dependencies = [BasicNetworkComponent::class],
    modules = [ActivityModule::class, testModule::class])
interface ActivityComponent {
    fun inject(context: MainActivity): Unit
}