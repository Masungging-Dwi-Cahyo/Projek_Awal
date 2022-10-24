package com.masungging.projekawal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(
    private val context: Context,
    private val dataset: List<ModelActivity>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Memeberikan referensi ke tampilan untuk setiap item data
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    /**
     * Untuk membuat tampilan baru
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // Membuat tampilan baru
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    /**
     * Mengganti tampilan
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    override fun getItemCount() = dataset.size
}