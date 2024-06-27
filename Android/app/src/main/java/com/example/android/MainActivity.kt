package com.example.android

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import io.flutter.embedding.engine.FlutterEngineGroup

class MainActivity : AppCompatActivity() {

    companion object {
        var engines: FlutterEngineGroup? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        engines = FlutterEngineGroup(this, arrayOf())

        val text = findViewById<TextView>(R.id.textView)
        text.setOnClickListener {
            FlutterModuleActivity.launch(this@MainActivity)
        }
    }
}