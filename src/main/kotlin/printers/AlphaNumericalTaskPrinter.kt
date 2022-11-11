package printers

import console.Input
import console.inputHandlers.AlphaNumericHandler

/**
 * Alpha numerical task printer
 *
 * Виводить інформацію про завданння 1 лабораторної роботи 12 та організовує взаємодію з користувачем
 */
class AlphaNumericalTaskPrinter:Printer {
    private var res = ""

    override fun conditions(): AlphaNumericalTaskPrinter {
        println("Написати программу, що робить перевірку, чи є значення символьної змінної, що введена з клавіатури:\n" +
                "- цифрою від 0 до 9\n" +
                "- малою латинською літерою;\n" +
                "- латинською літерою (великою чи малою)")
        return this
    }

    override fun prompt(): AlphaNumericalTaskPrinter {
        println("Введіть символ:")
        return this
    }

    override fun input(): AlphaNumericalTaskPrinter {
        res = Input.value(AlphaNumericHandler())
        return this
    }

    override fun result() {
        println("Відповідь: $res")
    }
}