package com.example.shayariapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.shayariapp.Model.ShayariModal
import com.example.shayariapp.databinding.ItemShayariBinding

class ShayariAdapter : RecyclerView.Adapter<ShayariAdapter.shayriHolder>() {
    var shayriList = ArrayList<ShayariModal>()
    lateinit var context: Context

    class shayriHolder(itemView: ItemShayariBinding) : RecyclerView.ViewHolder(itemView.root) {
        var binding = itemView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): shayriHolder {
        context = parent.context
        var binding = ItemShayariBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return shayriHolder(binding)
    }

    override fun getItemCount(): Int {
        return shayriList.size
    }

    override fun onBindViewHolder(holder: shayriHolder, position: Int) {
        holder.binding.apply {
            shayriList.get(position).apply {
                txtShayri.text = shayriList.toString()
            }
        }
    }

    fun setShyri(shyriList: ArrayList<ShayariModal>) {
        this.shayriList = shyriList
    }
}