package com.numerica98.evlab2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import kotlinx.android.synthetic.main.imagen_fragment.*
import kotlin.random.Random

class imagen_fragment : Fragment() {

    lateinit var picture : ImageView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var imgNum : Int = 2
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.imagen_fragment, container, false)
        with(this){
            picture = image
        }

        picture.setImageResource(
            when(imgNum){
                2 -> R.drawable.img1
                3 -> R.drawable.img3
                else -> R.drawable.img1
            }
        )


        return view;

    }
}