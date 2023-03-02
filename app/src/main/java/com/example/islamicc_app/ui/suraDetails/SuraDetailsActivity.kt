package com.example.islamicc_app.ui.suraDetails

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.islamicc_app.R
import com.example.islamicc_app.ui.Constants



class SuraDetailsActivity : AppCompatActivity() {

    lateinit var recycleView: RecyclerView
    lateinit var adapter: VersesAdapter
    lateinit var titleTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sura_details)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        titleTextView = findViewById(R.id.tilt_text_view)
        initRecycleView()

        val suraName: String = intent.getStringExtra(Constants.EXTRA_SURA_NAME) as String
        val suraPosition: Int = intent.getIntExtra(Constants.EXTRA_SURA_POS, -1)

        titleTextView.setText(suraName)
        readSuraFile(suraPosition)



    }

    private fun initRecycleView() {
        recycleView = findViewById(R.id.recycler_view)
        adapter = VersesAdapter()
        recycleView.adapter = adapter
    }

    fun readSuraFile(position: Int) {

        val fileName = "${position + 1}.txt"
        val fileContent = assets.open(fileName).bufferedReader().use { it.readText() }
        val verses: List<String> = fileContent.split("\n")
        adapter.changeData(verses)
    }


}