package com.example.enidemo.recyclerview

import androidx.recyclerview.widget.DiffUtil
import com.example.enidemo.Person

class PersonDiffCallback : DiffUtil.ItemCallback<Person>() {

    override fun areItemsTheSame(oldItem: Person, newItem: Person): Boolean {
        return oldItem.firstName == newItem.firstName
    }

    override fun areContentsTheSame(oldItem: Person, newItem: Person): Boolean {
        return oldItem.equals(newItem)
    }
}