package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // "Edit Profile" opens the sign-up / details form screen.
        findViewById<Button>(R.id.btnEditProfile).setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}
