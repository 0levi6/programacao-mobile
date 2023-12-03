package com.example.atvprova.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.atvprova.R
import com.example.atvprova.databinding.ItemPersonagemBinding
import com.example.atvprova.models.Personagem

class HomeAdapter(
    private val personagens: List<Personagem>
) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Recupera o objeto que infla um layout
        val layoutInflater = LayoutInflater.from(parent.context)

        // Infla o layout dos itens e retorna o ViewHolder
        val binding = ItemPersonagemBinding.inflate(layoutInflater, parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.personagem = personagens[position]

        Glide
            .with(holder.binding.root)
            .load(personagens[position].foto)
            .centerCrop()
            .placeholder(R.drawable.ic_imagem)
            .error(R.drawable.ic_imagem_erro)
            .into(holder.binding.personagemImgFoto);
    }

    override fun getItemCount(): Int  = personagens.size

    class ViewHolder(val binding: ItemPersonagemBinding) : RecyclerView.ViewHolder(binding.root)
}