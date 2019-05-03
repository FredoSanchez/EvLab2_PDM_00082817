package com.numerica98.evlab2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.botones_fragment.*

class botones_fragment : Fragment() {

    lateinit var botonIzq : Button
    lateinit var botonDer : Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        inflater.inflate(R.layout.botones_fragment, container, false)
        with(this){
            botonIzq = boton_izq
            botonDer = boton_der
        }


        return super.onCreateView(inflater, container, savedInstanceState)
    }
}