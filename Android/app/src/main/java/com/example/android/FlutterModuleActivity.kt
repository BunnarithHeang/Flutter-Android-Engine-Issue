package com.example.android

import android.content.Context
import android.content.Intent
import android.util.Log
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine

class FlutterModuleActivity : FlutterActivity() {

    private val engine: FlutterEngine by lazy {
        MainActivity.engines!!.createAndRunDefaultEngine(activity)
    }

    companion object {
        @JvmStatic
        fun launch(context: Context) {
            val intent = Intent(context, FlutterModuleActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK;

            context.startActivity(intent)
        }
    }

    // NOTE: If we don't provide the custom engine and use the implicit engine, the engine will be killed
    override fun provideFlutterEngine(context: Context): FlutterEngine {
        return engine
    }

    override fun onDestroy() {
        Log.d("", "Flutter Module Activity onDestroyed")
        super.onDestroy()
    }
}
