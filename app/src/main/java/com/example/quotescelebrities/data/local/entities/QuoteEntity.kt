package com.example.quotescelebrities.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "quote")
data class QuoteEntity ( //esta asociada a la base de datos
    @PrimaryKey(autoGenerate = true)
    @SerializedName("id") //pasar a un formato que pueda ser interpretado por la red
   //Inicializar si falla RECORDATORIO
    var id: Int,
   @SerializedName("quote") //cita
    var quote: String ,
  @SerializedName("author") //autor
    var author: String ,
)
