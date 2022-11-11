package console.inputHandlers

class IntRangeHandler (private val from:Int, private val to:Int) : ValueHandler<Int>  {
    override fun handle(): Int {
        val input: Int = readLine()!!.toInt()
        return if(input in from..to) input else throw NumberFormatException("Число від $from до $to")
    }
}