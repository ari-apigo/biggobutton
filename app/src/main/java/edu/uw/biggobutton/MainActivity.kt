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

        var count = 0
        var s = ""
        btn.setOnClickListener {
            count += 1

            if (count > 1) {
                s = "s"
            }

            btn.setText("You have pushed me $count time$s!")
        }
    }
}