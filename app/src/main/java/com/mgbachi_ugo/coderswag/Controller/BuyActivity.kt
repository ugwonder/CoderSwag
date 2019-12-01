package com.mgbachi_ugo.coderswag.Controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mgbachi_ugo.coderswag.R
import com.mgbachi_ugo.coderswag.Utilities.EXTRA_CATEGORY

class BuyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

    }


}
