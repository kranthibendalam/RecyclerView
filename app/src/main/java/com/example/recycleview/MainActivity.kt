package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var layoutManger:RecyclerView.LayoutManager?=null
    private var adapter :RecyclerView.Adapter<ReAdapter.ViewHolder>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layoutManger = LinearLayoutManager(this)
        reCyc.layoutManager = layoutManger
        adapter=ReAdapter()
        reCyc.adapter= adapter
    }
}