
    fun main() {

        for (i in 1..100 step 2) {

            println(i)
            when{
                i<50 -> smallNumber(i)
                else -> bigNumber(i)
            }
        }

    }
    fun smallNumber(n: Int) {
        println("small number")
    }
    fun bigNumber(n: Int) {
        println("big number")
    }




