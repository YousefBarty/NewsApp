package com.example.newsapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newsapp.Model.Article
import com.example.newsapp.R

class NewsAdapter(val newsList: List<Article>) :
    RecyclerView.Adapter<CharacterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return CharacterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {

        var charchter = newsList.get(position)
        holder.author.text = charchter.author
        holder.content.text = charchter.content
        holder.description.text = charchter.description
        holder.title.text = charchter.title

        Glide.with(holder.urlToImage.context).load(charchter.urlToImage).into(holder.urlToImage)


    }
}

class CharacterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val author: TextView = itemView.findViewById(R.id.author)
    val content: TextView = itemView.findViewById(R.id.content)
    val description: TextView = itemView.findViewById(R.id.description)
    val title: TextView = itemView.findViewById(R.id.title)
    val urlToImage: ImageView = itemView.findViewById(R.id.urlToImage)


}
