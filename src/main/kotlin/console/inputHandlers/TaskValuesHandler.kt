package console.inputHandlers


class TaskValuesHandler : ValuesHandler<Double> {
    /**
     * @return Повертає необхідні значення для розв'язання задачі у вигляді списку
     */
    override fun handle(): List<Double> = readLine()!!.split("[^0-9.]+".toRegex()).map(String::toDouble)
}