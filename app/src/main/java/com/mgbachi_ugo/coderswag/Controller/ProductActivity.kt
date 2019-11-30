package com.mgbachi_ugo.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mgbachi_ugo.coderswag.R
import com.mgbachi_ugo.coderswag.Utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)

    }
}
