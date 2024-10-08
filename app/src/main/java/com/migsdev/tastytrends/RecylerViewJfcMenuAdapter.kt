package com.migsdev.tastytrends

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewJfcMenuAdapter constructor(private val getActivity: JFCActivity, private val jfcList: List<JFC>)
    : RecyclerView.Adapter<RecyclerViewJfcMenuAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_jfc_menu_lists, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvmenuName.text = jfcList[position].title
        holder.tvprice.text = jfcList[position].price
        holder.ivJfcmenuImg.setImageResource(jfcList[position].image)

        holder.cardView.setOnClickListener {
            Toast.makeText(getActivity, jfcList[position].title, Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return jfcList.size
    }

    // ViewHolder class must extend RecyclerView.ViewHolder
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvmenuName: TextView = itemView.findViewById(R.id.tvmenuName)
        val ivJfcmenuImg: ImageView = itemView.findViewById(R.id.ivJfcmenuImg)
        val tvprice: TextView = itemView.findViewById(R.id.tvPrice)
        val cardView: CardView = itemView.findViewById(R.id.cardView)
    }
}
