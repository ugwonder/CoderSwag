package com.mgbachi_ugo.coderswag.Controller

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mgbachi_ugo.coderswag.Adapter.CategoryRecycleAdapter
import com.mgbachi_ugo.coderswag.R
import com.mgbachi_ugo.coderswag.Services.DataService
import com.mgbachi_ugo.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       adapter = CategoryRecycleAdapter(this, DataService.categories) {category ->
           val productIntent = Intent(this, ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
           startActivity(productIntent)
       }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

        }
    }
