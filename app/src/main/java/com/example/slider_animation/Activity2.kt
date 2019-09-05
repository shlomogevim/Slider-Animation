package com.example.slider_animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.r0adkll.slidr.Slidr
import com.r0adkll.slidr.model.SlidrInterface

class Activity2 : AppCompatActivity() {

    lateinit var slider:SlidrInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

       // Slidr.attach(this)
        slider=Slidr.attach(this)
    }

    fun lockSlide(view: View) {
        slider.lock()
    }
    fun unlockSlide(view: View) {
        slider.unlock()
    }
}
