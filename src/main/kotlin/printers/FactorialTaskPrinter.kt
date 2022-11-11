package printers

import LB07.MathFunctions
import console.Input
import console.inputHandlers.IntHandler

/**
 * Factorial task printer
 * Виводить інформацію про завданння 2 лабораторної роботи 7 та організовує взаємодію з користувачем
 *
 */
class FactorialTaskPrinter:Printer {
    private val t: MathFunctions = MathFunctions()
    private var n: Int = 0

    override fun conditions(): FactorialTaskPrinter {
        println("Програма має рахувати n! Число n вводить користувач.")
        return this
    }

    override fun prompt(): FactorialTaskPrinter {
        println("Введіть число, для якого потрібно знайти факторіал:")
        return this
    }

    override fun input(): FactorialTaskPrinter {
        n = Input.value(IntHandler())
        return this
    }

    override fun result() {
        println("Відповідь:\n${t.factorial(n)}")
    }
}