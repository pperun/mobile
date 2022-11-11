package console.inputHandlers

class IntHandler : ValueHandler<Int>  {
    override fun handle(): Int = readLine()!!.toInt()
}