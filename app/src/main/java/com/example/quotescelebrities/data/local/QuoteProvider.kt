package com.example.quotescelebrities.data.local

import com.example.quotescelebrities.domain.model.QuoteModel

class QuoteProvider {

    companion object {
        fun random(): QuoteModel { //Genera un número aleatorio del 0 al 11
            val position = (0..11).random()
            return quotes[position]
        }
        fun getQuote(position:Int): QuoteModel {
            return quotes[position]
        }


        private val quotes = listOf(
            QuoteModel(
                id = 1,
                quote = """La mejor forma de obtener información correcta de los foros de 
                    |Usenet es enviar algo incorrecto y esperar las correcciones""".trimMargin(), //trimMargin sirve para eliminar espacios en blanco de ambos lados
                author = "Matthew Austern"
            ),
            QuoteModel(
                id = 2,
                quote = """No temo a los ordenadores; lo que temo es quedarme sin ellos""",
                author = "Isaac Asimov"
            ),
            QuoteModel(
                id = 12,
                quote = """Pienso que los virus informáticos muestran la naturaleza humana: 
                    |la única forma de vida que hemos creado hasta el momento es puramente destructiva""".trimMargin(),
                author = "Stephen Hawking"
            ),
            QuoteModel(
                id = 3,
                quote = """Una vez un ordenador me venció jugando al ajedrez, pero no me opuso 
                    |resistencia cuando pasamos al kick boxing""".trimMargin(),
                author = "Emo Philips"
            ),
            QuoteModel(
                id = 4,
                quote = "Los estándares son siempre obsoletos. Eso es lo que los hace estándares",
                author = "Alan Bennett"
            ),
            QuoteModel(
                id = 5,
                quote = """El hardware es lo que hace a una máquina rápida; el software es lo que 
                    |hace que una máquina rápida se vuelva lenta""".trimMargin(),
                author = "Craig Bruce"
            ),
            QuoteModel(
                id = 6,
                quote = """En la actualidad nos hacen creer que ayudar a un amigo es moralmente
                    |equivalente a atacar un barco. Te llaman pirata""".trimMargin(),
                author = "Richard Stallman"
            ),
            QuoteModel(
                id = 7,
                quote = """Si piensas que la tecnología puede solucionar tus problemas de seguridad,
                     |está claro que ni entiendes los problemas ni entiendes la tecnología""".trimMargin(),
                author = "Bruce Schneier"),
            QuoteModel(
                id = 8,
                quote = "Hablar es fácil. Muéstrame el código.",
                author = "Linus Torvalds"),
            QuoteModel(
                id = 9,
                quote = """Enseñar a los niños el uso de software libre en las escuelas, 
                    |formará individuos con sentido de libertad""".trimMargin(),
                author = "Richard Stallman"
            ),
            QuoteModel(
                id = 10,
                quote = "El mejor lugar para estudiar es el ITVO",
                author = "Academia de Informatica y Tics"),
            QuoteModel(
                id = 11,
                quote = "El respeto al derecho ajeno es la paz",
                author = "Benito Juárez García")
        )
    }
}

