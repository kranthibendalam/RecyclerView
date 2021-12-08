package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ReAdapter : RecyclerView.Adapter<ReAdapter.ViewHolder>(){

    private var title= arrayOf("1.WhatsappMessenger","2.Facebook","3.Amazon","4.Twitter","5.Instagram","6.mxPlayer")
    private var dis = arrayOf("Whatsapp Inc","facebook","amazon","twitter","instagram","mxplayer")
    private var images = intArrayOf(R.drawable.whatsapp,
        R.drawable.facebook,
        R.drawable.amazon,
        R.drawable.twitter,
        R.drawable.download,
        R.drawable.mxplayer)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReAdapter.ViewHolder {

      val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)

      return ViewHolder(v)

    }

    override fun getItemCount(): Int {
        return title.size

    }

    override fun onBindViewHolder(holder: ReAdapter.ViewHolder,position: Int) {
         holder.itemText.text=title[position]
        holder.itemDescription.text=dis[position]
        holder.itemImage.setImageResource(images[position])
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        var itemImage: ImageView
        var itemText: TextView
        var itemDescription: TextView

        init {
            itemImage= itemView.findViewById(R.id.imgV3)
            itemText=itemView.findViewById(R.id.textV)
            itemDescription=itemView.findViewById(R.id.textV1)
        }
    }

}