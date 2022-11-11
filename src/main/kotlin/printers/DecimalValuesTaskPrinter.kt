package printers

import LB07.MathFunctions
import console.Input
import console.inputHandlers.IntHandler

/**
 * Decimal values task printer
 *Виводить інформацію про завданння 3 лабораторної роботи 7 та організовує взаємодію з користувачем
 */
class DecimalValuesTaskPrinter:Printer {
    private val t: MathFunctions = MathFunctions()
    private var n: Int = 0

    override fun conditions(): DecimalValuesTaskPrinter {
        println("Написати программу обчислення кількості (ми не знаємо кількість цифр) десяткових цифр\n" +
                "натурального числа. Не використовувати стрічки, суто математичні операції.")
        return this
    }

    override fun prompt(): DecimalValuesTaskPrinter {
        println("Введіть натуральне число:")
        return this
    }

    override fun input(): DecimalValuesTaskPrinter {
        n = Input.value(IntHandler())
        return this
    }

    override fun result() {
        println("Відповідь:\n${t.decimalValues(n)}")
    }
}