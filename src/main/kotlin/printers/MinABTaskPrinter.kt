package printers

import LB12.MathFunctions
import console.Input
import console.inputHandlers.IntRangeHandler

/**
 * Min a b task printer
 * Виводить інформацію про завданння 5 лабораторної роботи 12 та організовує взаємодію з користувачем
 */

class MinABTaskPrinter:Printer {
    private var n:Int = 0
    private val m = MathFunctions()

    override fun conditions(): Printer {
        println("Написати процедуру обчислення за цілим N>3 таких натуральних A і B, що " +
                "5A-2B=N, причому A+B мінімально.")
        return this
    }

    override fun prompt(): Printer {
        println("Введіть N:")
        return this
    }

    override fun input(): Printer {
        n = Input.value(IntRangeHandler(4, Int.MAX_VALUE))
        return this
    }

    override fun result() {
        println("Відповідь:\n${m.minAB(n)}")
    }
}