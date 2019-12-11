package c.gingdev.daggerstudy.ui

import android.os.Bundle

abstract class InjectableActivity: BaseActivity() {
    abstract fun inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        inject()
    }
}