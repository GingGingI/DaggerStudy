package c.gingdev.daggerstudy.module.basic

import android.app.Activity
import c.gingdev.daggerstudy.etc.UserScope
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    @UserScope
    fun provideActivity() = activity
}