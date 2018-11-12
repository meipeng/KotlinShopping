package dianshang.com.shopping

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"hello world",Toast.LENGTH_LONG).show()

        Toast.makeText(this,"hello world1",Toast.LENGTH_LONG).show()
    }
}
