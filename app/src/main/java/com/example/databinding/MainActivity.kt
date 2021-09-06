package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        // first set data
      // binding.users = Users("enesseluk25","enes",21,"enesselcu25@gmail.com","sene","erzurum")


        binding.users = user()

        // Glide
        Glide.with(this)
            .load(user().image)
            .into(binding.imageView)


    }

    //second set data
    private fun user():Users  {
        return Users("enesselcuk25","enes",21,"enesselcu25@gmail.com","sene","erzurum","https://voonze.com/wp-content/uploads/2020/07/img_5f2162a15c4d1.gif")
    }



}