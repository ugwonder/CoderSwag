package com.mgbachi_ugo.coderswag.Controller

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mgbachi_ugo.coderswag.Model.UnitProduct
import com.mgbachi_ugo.coderswag.R
import com.mgbachi_ugo.coderswag.Utilities.EXTRA_UNITPRODUCT
import kotlinx.android.synthetic.main.activity_buy.*


class BuyActivity : AppCompatActivity() {
    lateinit var buyImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy)

        val product = intent.getParcelableExtra<UnitProduct>(EXTRA_UNITPRODUCT)

        val resourceId = resources.getIdentifier(product.image, "drawable", packageName)
        buyproductImage?.setImageResource(resourceId)

        buyProductName.text = "${product.cat} - ${product.title}"
        productdetails.text = "${product.title} ${product.price} "


        homeBtn.setOnClickListener {
          val mainIntent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)
        }
        buyBtn.setOnClickListener {
            Toast.makeText(this, "your purchase is being processed", Toast.LENGTH_SHORT).show()
        }


    }


}

