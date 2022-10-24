package com.masungging.projekawal

import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        title = getString(R.string.detail_prefix)

        val myDataset = Datasource().loadModelActivity()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)
    }

}