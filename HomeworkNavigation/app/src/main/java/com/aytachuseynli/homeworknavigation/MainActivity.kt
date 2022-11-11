package com.aytachuseynli.homeworknavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import com.aytachuseynli.homeworknavigation.databinding.ActivityMainBinding
import com.aytachuseynli.homeworknavigation.databinding.FragmentMainScreenBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

}