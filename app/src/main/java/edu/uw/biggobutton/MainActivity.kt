package edu.uw.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)

        var txtPushed = getString(R.string.btn_text_pushed)

        var count = 0
        var s = ""
        btn.setOnClickListener {
            count += 1

            if (count > 1) {
                s = "s"
            }

            btn.setText(getString(R.string.btn_text_pushed, count, s))
//            var test = getString(R.string.btn_text_pushed, count, s)
//            Toast.makeText(this, test, Toast.LENGTH_LONG).show()
        }
    }
}