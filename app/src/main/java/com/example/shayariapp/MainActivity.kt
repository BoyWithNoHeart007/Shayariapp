package com.example.shayariapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shayariapp.Adapter.ShayariAdapter
import com.example.shayariapp.Database.ExternalDB
import com.example.shayariapp.Model.ShayariModal
import com.example.shayariapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: ShayariAdapter
    lateinit var DatabaseHelper : ExternalDB
    var shayriList = ArrayList<ShayariModal>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ShayariAdapter()

        DatabaseHelper = ExternalDB(this, "shayari.db", 5)
        this.DatabaseHelper.CheckDb()
        shayriList = DatabaseHelper.shyri as ArrayList<ShayariModal>

        adapter.setShyri(shayriList)
        binding.rcvShayri.layoutManager = LinearLayoutManager(this)
        binding.rcvShayri.adapter = adapter

    }
}