package mx.ipn.cic.geo.bitmaps_corutinas

class RandomImage {
    companion object{//Para utilizar los metodos de la clase sin necesidad de instanciar un objeto
        /*Lista de identificadores de las posibles imagenes a mostrar*/
        private val imagesId : List<Int> = listOf(R.drawable.poke1, R.drawable.poke2, R.drawable.poke3, R.drawable.poke4,
            R.drawable.poke5, R.drawable.poke6, R.drawable.poke7, R.drawable.poke8, R.drawable.poke9, R.drawable.poke10)

        /*Metodo que retorna un identificador de la imagen de forma aleatoria*/
        fun getRandomID():Int{
            return this.imagesId.random()
        }
    }

}