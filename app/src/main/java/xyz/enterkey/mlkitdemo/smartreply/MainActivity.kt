package xyz.enterkey.mlkitdemo.smartreply

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import xyz.enterkey.mlkitdemo.smartreply.chat.ChatFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, ChatFragment.newInstance())
                    .commitNow()
        }
    }
}
