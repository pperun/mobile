package printers

import HW12.StringUtility

class StringTaskPrinter:Printer {
    private var input = ""

    override fun conditions(): Printer {
        println("Написати програму, що зчитує з клавіатури стрічку і повертає (кожен пункт оформити у вигляді методу)")
        return this
    }

    override fun prompt(): Printer {
        println("Введіть строку:")
        return this
    }

    override fun input(): Printer {
        input = readLine()!!
        return this
    }

    override fun result() {
        println(
            "Відповідь:\n" +
            "Слів в строці: ${StringUtility.wordsCount(input)}\n" +
            "Чисел в строці: ${StringUtility.numbersCount(input)}\n" +
            "Строка з літер: ${StringUtility.trimPunctuation(input)}\n" +
            "Строка без зайвих пробілів: ${StringUtility.removeMultipleSpaces(input)}\n" +
            "Слова, які починаються з великої літери: ${StringUtility.upperCaseWords(input)}\n"
        )
    }
}