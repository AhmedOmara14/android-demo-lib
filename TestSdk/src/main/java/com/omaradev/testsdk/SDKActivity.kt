package com.omaradev.testsdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class SDKActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sdkactivity)

        Picasso.get().load("https://th.bing.com/th/id/R.a8e61fe5d59eede2508a86ebb0fe9758?rik=QvZtXfidUnezmw&pid=ImgRaw&r=0").into(findViewById<ImageView>(R.id.iv_Image))
    }
}