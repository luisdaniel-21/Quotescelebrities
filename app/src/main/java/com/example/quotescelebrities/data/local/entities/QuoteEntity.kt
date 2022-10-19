package com.example.quotescelebrities.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "quote")
data class QuoteEntity ( //esta asociada a la base de datos
    @PrimaryKey
    @SerializedName("id") //pasar a un formato que pueda ser interpretado por la red
    var id: Int=0,
    @SerializedName("quote") //cita
    var quote: String = "",
    @SerializedName("author") //autor
    var author: String = "",
)
