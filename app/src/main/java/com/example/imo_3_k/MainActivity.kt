package com.example.imo_3_k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews(){
        var recyclerView = findViewById<RecyclerView>(R.id.rv)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1))

        refreshAdapter(recyclerView, getAllChats())
    }

    private fun refreshAdapter(recyclerView: RecyclerView?, chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView?.adapter = adapter
    }

    private fun getAllChats(): ArrayList<Chat> {
        val chats:ArrayList<Chat> = ArrayList()

        chats.add(Chat(R.drawable.foto2,"Omonboyev Abdulhakim",2))
        chats.add(Chat(R.drawable.foto3,"Muqumjonov Yunusbek",0))
        chats.add(Chat(R.drawable.foto4,"Abdurashidov Muslimbek",7))
        chats.add(Chat(R.drawable.foto5,"Abduvoxobov Abbosbek",1))
        chats.add(Chat(R.drawable.foto2,"Omonboyev Abdulhakim",2))
        chats.add(Chat(R.drawable.foto3,"Muqumjonov Yunusbek",0))
        chats.add(Chat(R.drawable.foto4,"Abdurashidov Muslimbek",7))
        chats.add(Chat(R.drawable.foto5,"Abduvoxobov Abbosbek",1))
        chats.add(Chat(R.drawable.foto2,"Omonboyev Abdulhakim",2))
        chats.add(Chat(R.drawable.foto3,"Muqumjonov Yunusbek",0))
        chats.add(Chat(R.drawable.foto4,"Abdurashidov Muslimbek",7))
        chats.add(Chat(R.drawable.foto5,"Abduvoxobov Abbosbek",1))
        chats.add(Chat(R.drawable.foto2,"Omonboyev Abdulhakim",2))
        chats.add(Chat(R.drawable.foto3,"Muqumjonov Yunusbek",0))
        chats.add(Chat(R.drawable.foto4,"Abdurashidov Muslimbek",7))
        chats.add(Chat(R.drawable.foto5,"Abduvoxobov Abbosbek",1))

        return chats
    }
}