package com.example.islamicc_app.ui.spalsh


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.islamicc_app.ui.home.HomeActivity
import com.example.islamicc_app.R


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler(Looper.getMainLooper())
            .postDelayed(
                { starthomeactivity() }, 2000)
    }

    fun starthomeactivity() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()

    }

}