package com.mgbachi_ugo.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.mgbachi_ugo.coderswag.Adapter.CategoryAdapter
import com.mgbachi_ugo.coderswag.Model.Category
import com.mgbachi_ugo.coderswag.R
import com.mgbachi_ugo.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter
    }
}
