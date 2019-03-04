package com.example.silvi.contactapplication

import android.R.id
import android.graphics.Bitmap
import android.media.Image
import android.widget.TextView
import android.support.v7.widget.RecyclerView
import java.nio.file.Files.size
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import  kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_view_contact.*
import kotlinx.android.synthetic.main.activity_view_contact.view.*


class ContactAdapter(private val data: ArrayList<Contact>) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        return ContactViewHolder(LayoutInflater.from(parent.context).inflate(com.example.silvi.contactapplication.R.layout.item_contact, parent, false))
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val Contact = data[position]
        holder.contactImg.setImageBitmap(Contact.getContactImage())
        holder.contactNam.setText(Contact.getContactName())
        holder.contactPho.setText(Contact.getContactPhone())
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var contactImg: ImageView
        var contactNam: TextView
        var contactPho: TextView

        init {
            contactImg = itemView.findViewById(R.id.contactImageC) as ImageView
            contactNam = itemView.findViewById(R.id.contactNameC)
            contactPho = itemView.findViewById(R.id.contactPhoneC)
        }
    }
}