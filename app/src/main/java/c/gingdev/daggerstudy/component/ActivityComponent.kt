package c.gingdev.daggerstudy.component

import android.content.Context
import c.gingdev.daggerstudy.etc.UserScope
import c.gingdev.daggerstudy.module.basic.ActivityModule
import dagger.Component

@UserScope
@Component(dependencies = [BasicNetworkComponent::class],
    modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(context: Context): Unit
}