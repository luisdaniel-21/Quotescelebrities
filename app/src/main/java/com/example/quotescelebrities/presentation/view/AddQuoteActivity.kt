package com.example.quotescelebrities.presentation.view

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.room.Room
import com.example.quotescelebrities.data.local.QuoteDB
import com.example.quotescelebrities.data.local.daos.QuoteDao
import com.example.quotescelebrities.data.local.entities.QuoteEntity
import com.example.quotescelebrities.databinding.ActivityAddQuoteBinding
import com.example.quotescelebrities.domain.model.QuoteModel
import com.example.quotescelebrities.presentation.view_model.QuoteRandomViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch


class AddQuoteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddQuoteBinding
    private lateinit var appDb : QuoteDB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddQuoteBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // setContentView(R.layout.activity_add_quote)

        binding.buttonAddQuote.setOnClickListener {
          //  writeData()
        }

    }
/*
    private fun writeData(){
        val idQuote = binding.idQuote.text.toString()
        val author = binding.edtAddAuthor.text.toString()
        val quote = binding.edtAddQuote.text.toString()

        if (author.isNotEmpty() && quote.isNotEmpty()){
            val quotes = QuoteModel(0, quote, author)
            GlobalScope.launch(Dispatchers.IO){

                appDb.quoteDao().insert(quotes)

            }
            binding.edtAddQuote.text.clear()
            binding.edtAddAuthor.text.clear()
            binding.idQuote.text.clear()

            Toast.makeText(this, "Agregado Correctamente", Toast.LENGTH_SHORT).show()

        }else{
            Toast.makeText(this, "Ah ocurrido un error", Toast.LENGTH_SHORT).show()

        }

    }*/

}
