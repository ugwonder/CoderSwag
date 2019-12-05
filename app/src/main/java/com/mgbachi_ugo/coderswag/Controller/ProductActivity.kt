package com.mgbachi_ugo.coderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.mgbachi_ugo.coderswag.Adapter.ProductAdapter
import com.mgbachi_ugo.coderswag.Model.UnitProduct
import com.mgbachi_ugo.coderswag.R
import com.mgbachi_ugo.coderswag.Services.DataService
import com.mgbachi_ugo.coderswag.Utilities.EXTRA_CATEGORY
import com.mgbachi_ugo.coderswag.Utilities.EXTRA_UNITPRODUCT
import kotlinx.android.synthetic.main.activity_product.*



class ProductActivity : AppCompatActivity() {
    lateinit var adapter : ProductAdapter
    var unitProduct = UnitProduct("", "", "", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        productCategoryName.text = "Products - $categoryType"

        adapter = ProductAdapter(this, DataService.getProduct(categoryType)) {product ->
            unitProduct.title = product.title
            unitProduct.price = product.price
            unitProduct.image = product.image
            unitProduct.cat = categoryType
            val buyIntent = Intent(this, BuyActivity::class.java)
            buyIntent.putExtra(EXTRA_UNITPRODUCT, unitProduct)
            startActivity(buyIntent)
        }


        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 4
        }
        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720) {
            spanCount = 3
        }
        val layoutManager = GridLayoutManager(this, spanCount)
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter
    }
}


