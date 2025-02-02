package com.example.recyclerviewapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var titles= arrayOf("birlamandir","budhastatue","Charminar","golconda","sanghitemple",
        "jaganadhtemple")

    private var details=arrayOf("Birla Mandir, built with pure white marble, is a magnificent temple " +
            "dedicated to Lord Venkateswara and offers panoramic city views",
        "Located on Gibraltar Rock in Hussain Sagar Lake, the Buddha Statue is one of the tallest " +
                "monolithic statues of Gautama Buddha",
        "Built in 1591, Charminar is an iconic symbol of Hyderabad known for its four grand arches.",
        "Golconda Fort, the former seat of the Qutb Shahi dynasty, is famous for its impressive " +
                "architecture and acoustic marvels",
        "Situated on a hill, Sanghi Temple is a serene Hindu temple dedicated to Lord Venkateswara, " +
                "offering stunning views","This temple in Hyderabad is inspired by the famous Jagannath " +
                "Temple in Puri and is dedicated to Lord Jagannath.")
    private var images= intArrayOf(R.drawable.birlamandir,R.drawable.budhastatue,
        R.drawable.charminar,R.drawable.golconda,R.drawable.sanghitemple,R.drawable.jaganadhtemple)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.card_view,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text=titles[position]
        holder.itemDetail.text=details[position]
        holder.itemImage.setImageResource(images[position])

    }

    override fun getItemCount(): Int {
       return titles.size
    }

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var itemImage:ImageView
        var itemTitle:TextView
        var itemDetail:TextView

        init {
            itemImage=itemView.findViewById(R.id.image_view)
            itemTitle=itemView.findViewById(R.id.item_title)
            itemDetail=itemView.findViewById(R.id.item_detail)


            itemView.setOnClickListener{
                val position:Int=adapterPosition
                Toast.makeText(itemView.context,"you clicked on ${titles[position]}",Toast.LENGTH_SHORT).show()
            }
        }

    }
}