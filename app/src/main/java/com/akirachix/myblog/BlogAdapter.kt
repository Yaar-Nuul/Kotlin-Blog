package com.akirachix.myblog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BlogAdapter(var contentList: List<Content>):
    RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.blog_list_item, parent,false)
        return ContactsViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val content = contentList[position]
        holder.tvName.text = content.title
        holder.tvDate.text = content.date

    }
    override fun getItemCount(): Int {
        return contentList.size
    }
}
class ContactsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvName = itemView.findViewById<TextView>(R.id.tvName)
    val tvDate = itemView.findViewById<TextView>(R.id.tvDate)

}