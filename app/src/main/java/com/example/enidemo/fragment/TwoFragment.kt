package com.example.enidemo.fragment

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.enidemo.R

/**
 * A simple [Fragment] subclass.
 * Use the [TwoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TwoFragment : Fragment() {

    lateinit var nom : String;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Comment récupérer les arguments
        val args = arguments?.let { TwoFragmentArgs.fromBundle(it) }
        nom = args?.nom.toString()
        val code = args?.code


        println(String.format("%s => %s", nom, code))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         val layoutInflater = inflater.inflate(R.layout.fragment_two, container, false)

        layoutInflater.findViewById<TextView>(R.id.tv_nom).text = nom;

        return layoutInflater;
    }
}