package com.generation.task4e5.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.generation.task4e5.R
import com.generation.task4e5.model.Tarefa

class Tarefaadapter : RecyclerView.Adapter<Tarefaadapter.tarefaViewHolder>(){

     private var listatarefa = emptyList<Tarefa>()

    class tarefaViewHolder (view: View) : RecyclerView.ViewHolder(view){



        val textautor =view.findViewById<TextView>(R.id.textautor)
        val textcategoria =view.findViewById<TextView>(R.id.textcategoria)
        val imageview =view.findViewById<TextView>(R.id.imageView)
        val texttitulo =view.findViewById<TextView>(R.id.texttitulo)
        val textdescricao =view.findViewById<TextView>(R.id.textdescricao)
        val textdata =view.findViewById<TextView>(R.id.textdata)
        val texthora =view.findViewById<TextView>(R.id.texthora)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tarefaViewHolder {

        val layout =LayoutInflater.from(parent.context)

            .inflate(R.layout.card_layout_tarefa, parent, false)

                return tarefaViewHolder(layout)
    }

    override fun onBindViewHolder(holder: tarefaViewHolder, position: Int) {

        val tarefa= listatarefa[position]


        holder.textautor.text= tarefa.autor
        holder.textcategoria.text= tarefa.categoria
        holder.imageview.text= tarefa.imagem
        holder.texttitulo.text= tarefa.titulo
        holder.textdescricao.text= tarefa.descricao
        holder.textdata.text= tarefa.data
        holder.texthora.text= tarefa.hora

    }

    override fun getItemCount(): Int {
        return listatarefa.size
    }

fun setlista(lista: List<Tarefa>){

    listatarefa = lista
    notifyDataSetChanged()



}





}