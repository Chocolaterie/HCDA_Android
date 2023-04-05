package com.example.enidemo.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.enidemo.Person
import com.example.enidemo.databinding.ItemPersonBinding

class ListPersonAdapter : ListAdapter<Person, ListPersonAdapter.ViewHolder>(PersonDiffCallback()) {

    // Quand j'essaie de connecter une donnée dans sur la ligne
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // je récupère la personne d'une liste de données
        val person = getItem(position)
        // je connecte la personne récupérée en question dans la ligne
        holder.bind(person)
    }

    // Lorsque que j'essaie de créer une ligne (la style d'une ligne)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent);
    }

    // Une classe Interne pour définir la cellule/ligne dans un RecyclerView
    class ViewHolder(val binding : ItemPersonBinding) : RecyclerView.ViewHolder(binding.root) {

        // Fait le lien avec une personne dans la ligne/cellule
        fun bind(item: Person){
            binding.person = item
            binding.executePendingBindings()
        }

        companion object{
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemPersonBinding.inflate(layoutInflater, parent, false)

                return ViewHolder(binding)
            }
        }
    }
}