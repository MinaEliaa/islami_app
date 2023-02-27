package com.example.islamicc_app.ui.home.fragments

import android.media.Image
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.islamicc_app.R

class TasbeehFragment :Fragment () {

    lateinit var image: ImageView
    lateinit var phase: TextView
    var counter :Int = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tasbeeh,container,false)

    }

}