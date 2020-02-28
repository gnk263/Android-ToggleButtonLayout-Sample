package jp.test.togglebuttonsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.savvyapps.togglebuttonlayout.Toggle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        repeat(3) {
            val toggle = Toggle(1 + it, null, "test$it")
            toggle_button_layout1.addToggle(toggle)
        }

        toggle_button_layout1.onToggledListener = { _, toggle, selected ->
            text1.text = "id:${toggle.id}, selected:$selected"
        }

        toggle_button_layout1.setToggled(1, true)
        text1.text = "id:1, selected:true"
    }
}
