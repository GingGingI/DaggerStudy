package c.gingdev.daggerstudy

import android.os.Bundle
import c.gingdev.daggerstudy.component.DaggerActivityComponent
import c.gingdev.daggerstudy.ui.InjectableActivity

class MainActivity : InjectableActivity() {
    override fun inject() {
        DaggerActivityComponent.builder()
            .basicNetworkComponent(App.getNetworkComponent(this))
            .build().inject(this)
    }

    override fun getLayoutResId(): Int {
        return R.layout.activity_main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}
