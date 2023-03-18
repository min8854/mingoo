package com.example.a3w15d_manggo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentsModel>()  //<--컨텐츠 url 연결

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(
            ContentsModel(
            "https://www.mangoplate.com/restaurants/iVugkw_bd0J5",
            "https://mp-seoul-image-production-s3.mangoplate.com/795419_1670724918541088.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
            "베이커리 밤마을 3.8"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/1bCoroF_KO",
                "https://mp-seoul-image-production-s3.mangoplate.com/1515134_1641452754760598.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "중문수두리보말칼국수 4.5"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/a6KR_fF0jA",
                "https://mp-seoul-image-production-s3.mangoplate.com/14929/2518194_1678406844091_1000008594?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "미영이네식당 4.7"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/UEmRRThzZP",
                "https://mp-seoul-image-production-s3.mangoplate.com/183601/2095412_1675167374115_1000006055?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "스시호시카이 4.5"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/wDezO7AENoAP",
                "https://mp-seoul-image-production-s3.mangoplate.com/406401/1918872_1634050182556_38039?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "신사전 4.3"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/pm-Tbo18zGXT",
                "https://mp-seoul-image-production-s3.mangoplate.com/184195/1604891_1670681900493_10611?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "월화고기 3.5"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/OiBBpWM4zRKi",
                "https://mp-seoul-image-production-s3.mangoplate.com/461441/txpckzeuexesvs.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "서유기마라탕&훠궈"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/SOBbQ4oSwl",
                "https://mp-seoul-image-production-s3.mangoplate.com/185296/783110_1604133292263_37623?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "부부요리단1탄 제주흑돼지갑오징어"
            )
        )
//----------------리사이클러뷰 연결
        val  recyclerview = findViewById<RecyclerView>(R.id.RV)
        val  rvAdapter = RVadapter(baseContext, items)
        recyclerview.adapter = rvAdapter

        rvAdapter.itemClick = object : RVadapter.ItemClick {
            override fun onClick(view: View, position: Int) {

                val intent = Intent(baseContext, View_Activity::class.java)
                intent.putExtra("url",items[position].url)
                startActivity(intent)
            }
        }
        recyclerview.layoutManager = GridLayoutManager(this,2)
    }
}