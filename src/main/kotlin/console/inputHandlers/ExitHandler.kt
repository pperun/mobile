package console.inputHandlers

class ExitHandler : ValueHandler<Boolean> {
    /**
     * @return Повертає ознаку виходу з програми
     */
    override fun handle(): Boolean = readLine()!!.equals("exit")
}