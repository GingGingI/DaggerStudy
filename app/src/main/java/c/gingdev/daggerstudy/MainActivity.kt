package c.gingdev.daggerstudy

import android.os.Bundle
import c.gingdev.daggerstudy.component.DaggerActivityComponent
import c.gingdev.daggerstudy.ui.InjectableActivity
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Retrofit
import javax.inject.Inject

class MainActivity : InjectableActivity() {
    @Inject lateinit var retrofit: Retrofit

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

        baseURL.text = "server baseUrl is ${retrofit.baseUrl()}"
    }
}
