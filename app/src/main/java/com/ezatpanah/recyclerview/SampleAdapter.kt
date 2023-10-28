package com.ezatpanah.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ezatpanah.recyclerview.databinding.ItemRowBinding

class SampleAdapter (val items : MutableList<SampleModel>)
    : RecyclerView.Adapter<SampleAdapter.ViewHolder>(){

    private lateinit var binding: ItemRowBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleAdapter.ViewHolder {
        val inflater =LayoutInflater.from(parent.context)
        binding=ItemRowBinding.inflate(inflater,parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SampleAdapter.ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    inner class ViewHolder(itemView : ItemRowBinding) : RecyclerView.ViewHolder(itemView.root){
        fun bind(item : SampleModel){
            binding.apply {
                tvId.text=item.id.toString()
                tvName.text=item.name
            }
        }
    }
}