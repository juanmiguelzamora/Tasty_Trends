package com.migsdev.tastytrends

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewStallsAdapter constructor(private val getActivity: DrawerNavigation, private val stallsList : List<Stalls>)
    : RecyclerView.Adapter<RecyclerViewStallsAdapter.MyViewHolder>() {

        var onItemClick : ((Stalls) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_stall_lists_item,parent, false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.ivStallsImg.setImageResource(stallsList[position].image)

        holder.cardView.setOnClickListener {
            Toast.makeText(getActivity, stallsList[position].title, Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return stallsList.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
//        val StallsTitle : TextView = itemView.findViewById(R.id.stallsTitle)
        val ivStallsImg : ImageView = itemView.findViewById(R.id.ivJfcmenuImg)
        val cardView : CardView = itemView.findViewById(R.id.cardView)
    }

}