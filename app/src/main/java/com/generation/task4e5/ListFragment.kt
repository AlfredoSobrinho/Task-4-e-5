package com.generation.task4e5

import android.os.Bundle
import android.service.controls.actions.FloatAction
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.generation.task4e5.adapter.Postadapter
import com.generation.task4e5.model.Post
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_list, container, false)




        val Listapost = mutableListOf(

                Post(
                    "ONG Alimento do bem",
                "Alimentação",
                "Link da imagem",
                "Ação na zona leste",
                "Distribuição de cestas básicas",
                "22/03/2022",
                "15:00"

                ),

            Post(
                "ONG Moradores de rua e seus cães",
                "Animais",
                "Link da imagem",
                "Arrecadação de ração",
                "Ponto de coleta da zona norte",
                "22/03/2022",
                "11:00"

            ),

            Post(
                "ONG Brincando de aprender",
                "Educação",
                "Link da imagem",
                "Inscrições abertas",
                "Vagas para crianças de 6 a 14 anos",
                "22/03/2022",
                "09:00"

            ),


            Post(
                "ONG Força jovem universal ",
                "Esportes",
                "Link da imagem",
                "Seminario especial",
                "Participaão do Faixa preta Geraldo",
                "22/03/2022",
                "07:00"

            )

        )


        val recyclepost = view.findViewById<RecyclerView>(R.id.recycletarefa)

        val adapter =Postadapter()

        recyclepost.layoutManager = LinearLayoutManager(context)
        recyclepost.adapter= adapter

        recyclepost.setHasFixedSize(true)

        adapter.setlista(Listapost)



        val botaoir = view.findViewById<FloatingActionButton>(R.id.floatingActionButton)

        botaoir.setOnClickListener {

            findNavController().navigate(
                R.id.action_listFragment_to_segundoFragment)


            }

        return view
    }

}
