package com.example.enidemo.tplieu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.enidemo.Person
import com.example.enidemo.databinding.ItemLieuBinding
import com.example.enidemo.databinding.ItemPersonBinding

class ListLieuAdapter : ListAdapter<Lieu, ListLieuAdapter.ViewHolder>(LieuDiffCallback()) {

    // Quand j'essaie de connecter une donnée dans sur la ligne
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // je récupère la lieu d'une liste de données
        val lieu = getItem(position)
        // je connecte la lieu récupérée en question dans la ligne
        holder.bind(lieu)
    }

    // Lorsque que j'essaie de créer une ligne (la style d'une ligne)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent);
    }

    // Une classe Interne pour définir la cellule/ligne dans un RecyclerView
    class ViewHolder(val binding : ItemLieuBinding) : RecyclerView.ViewHolder(binding.root) {

        // Fait le lien avec une personne dans la ligne/cellule
        fun bind(item: Lieu){
            binding.lieu = item
            binding.executePendingBindings()
        }

        companion object{
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemLieuBinding.inflate(layoutInflater, parent, false)

                return ViewHolder(binding)
            }
        }
    }
}