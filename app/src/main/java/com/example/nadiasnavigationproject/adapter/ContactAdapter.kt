package com.example.nadiasnavigationproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.nadiasnavigationproject.data.model.Contact
import com.example.nadiasnavigationproject.databinding.ItemListBinding
import com.example.nadiasnavigationproject.fragment.FirstFragment
import com.example.nadiasnavigationproject.fragment.FirstFragmentDirections

class ContactAdapter(
    val context: Context,
    val dataset: List<Contact>
): RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    inner class ContactViewHolder(val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val item = dataset[position]
        holder.binding.tvName.text = item.name

        holder.binding.cardContact.setOnClickListener {
            holder.itemView.findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(position))
        }
    }

}