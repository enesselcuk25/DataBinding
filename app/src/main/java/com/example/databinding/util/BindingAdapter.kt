package com.example.databinding.util

import android.content.Context
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

object BindingAdapter {
        // First way
    /*
    @JvmStatic
    @BindingAdapter("image")
    fun ImageView.image(url:String?){
        if (!url.isNullOrEmpty()) {
            val options =  RequestOptions()
                .placeholder(makePlaceholder(context))
                .error(R.mipmap.ic_launcher_round)

            Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(url).into(this)

        }

        this.background = ContextCompat.getDrawable(context,R.mipmap.ic_launcher_round)
    }

    private fun makePlaceholder(context:Context): CircularProgressDrawable {
        return CircularProgressDrawable(context).apply {
            strokeWidth = 9f
            centerRadius = 40f
            start()
        }
    }

     */
/*-----------------------------------------------------------------------------------------------*/
    //Second way
    @JvmStatic
    @BindingAdapter("image2")
    fun ImageView.image2(url:String) {
        Glide.with(this.context)
            .load(url)
            .into(this)
    }
}