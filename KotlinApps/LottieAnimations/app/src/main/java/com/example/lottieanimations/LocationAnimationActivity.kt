package com.example.lottieanimations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View

class LocationAnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location_animation)
    }

    fun activateLocationServices(view: View){
        val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
        startActivity(intent)
    }

    fun nextAnimation(view: View){
        val intent = Intent(this, InteractiveAnimations::class.java)
        startActivity(intent)
    }
}