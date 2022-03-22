package com.generation.task4e5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.generation.task4e5.adapter.Tarefaadapter
import com.generation.task4e5.model.Tarefa


class ListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_list, container, false)




        val listatarefa = mutableListOf(

                Tarefa(
                    "ONG Alimento do bem",
                "Alimentação",
                "Link da imagem",
                "Ação na zona leste",
                "Distribuição de cestas básicas",
                "22/03/2022",
                "15:00"

                ),

            Tarefa(
                "ONG Moradores de rua e seus cães",
                "Animais",
                "Link da imagem",
                "Arrecadação de ração",
                "Ponto de coleta da zona norte",
                "22/03/2022",
                "11:00"

            ),

            Tarefa(
                "ONG Brincando de aprender",
                "Educação",
                "Link da imagem",
                "Inscrições abertas",
                "Vagas para crianças de 6 a 14 anos",
                "22/03/2022",
                "09:00"

            ),


            Tarefa(
                "ONG Fonça jovem universal ",
                "Esportes",
                "Link da imagem",
                "Seminario especial",
                "Participaão do Faixa preta Geraldo",
                "22/03/2022",
                "07:00"

            )

        )


        val recycletarefa = view.findViewById<RecyclerView>(R.id.recycletarefa)

        val adapter =Tarefaadapter()

        recycletarefa.layoutManager = LinearLayoutManager(context)
        recycletarefa.adapter= adapter

        recycletarefa.setHasFixedSize(true)

        adapter.setlista(listatarefa)


        return view
    }

}