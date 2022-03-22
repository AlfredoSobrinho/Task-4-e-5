package com.generation.task4e5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class SegundoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_segundo, container, false)


        val botaovoltar = view.findViewById<Button>(R.id.voltar1)

        botaovoltar.setOnClickListener {

            findNavController().navigate(
                R.id.action_segundoFragment_to_listFragment


            )
        }



        return view
    }
}

