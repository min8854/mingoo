package com.example.a3w15d_manggo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RVadapter (val context : Context, val List : MutableList<ContentsModel>) : RecyclerView.Adapter<RVadapter.ViewHolder>(){  //<-- 어댑터에 뮤타블리스트는 사용할 아이템  (1)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVadapter.ViewHolder {
        val  v = LayoutInflater.from(parent.context).inflate(R.layout.rv_item,parent,false)
        return ViewHolder(v)
    }
        interface ItemClick {
        fun onClick(view : View, position: Int) }

         var itemClick : ItemClick? = null

        override fun onBindViewHolder(holder: RVadapter.ViewHolder, position: Int) {

              if (itemClick != null) {
                   holder.itemView.setOnClickListener { v->
                  itemClick!!.onClick(v,position)
                  }
                }
                holder.bindItems(List[position])
         }

             override fun getItemCount(): Int {
              return List.size
             }
//-----------뷰홀더 -------------
    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(item : ContentsModel) {    //-----뷰홀더 만드는 바인드 아이템에 아이템은 컨탠츠 모델이 있는 아이템 (2)
           //--------xml아이템 만들거 찾아와서 연결----- (3)
            val rv_img = itemView.findViewById<ImageView>(R.id.rvImageA)
            val rv_text = itemView.findViewById<TextView>(R.id.rvtextA)

            rv_text.text = item.titleText
            Glide.with(context)
                .load(item.imageUrl)
                .into(rv_img)

        }
    }
}