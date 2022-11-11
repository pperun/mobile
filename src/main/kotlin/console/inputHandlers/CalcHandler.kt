package console.inputHandlers

/**
 * Calc handler
 *
 * Обробник вхідних даних у форматі xyz,
 * де x - число(ціле або дійсне), y - оператор(+,-,/,*,^), z - число(ціле або дійсне)
 */

class CalcHandler:ValuesHandler<String> {
    override fun handle(): List<String> {
        val input = readLine()!!
        val (firstOperand, operation, secondOperand) =
            Regex("([0-9.]+)([+\\-/*\\^])([0-9.]+)")
            .find(input)!!
            .destructured

        return listOf(firstOperand, operation, secondOperand)
    }
}