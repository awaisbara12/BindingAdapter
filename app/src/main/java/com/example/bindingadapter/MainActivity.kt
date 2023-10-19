package com.example.bindingadapter

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import com.example.bindingadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val post = Post("Binding Adapter Testing",
            "Binding Adapter Testing with Images",
            "https://fastly.picsum.photos/id/465/1200/600.jpg?hmac=cjcYVx_7x7Piq1KRWXFQhzvK6UBLl6n5qwSMDL1gPZU")
        binding.post = post
    }
}