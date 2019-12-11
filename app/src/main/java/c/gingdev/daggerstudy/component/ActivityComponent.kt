package c.gingdev.daggerstudy.component

import c.gingdev.daggerstudy.MainActivity
import c.gingdev.daggerstudy.annotation.UserScope
import c.gingdev.daggerstudy.module.basic.ActivityModule
import dagger.Component

@UserScope
@Component(dependencies = [BasicNetworkComponent::class],
    modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(context: MainActivity): Unit
}