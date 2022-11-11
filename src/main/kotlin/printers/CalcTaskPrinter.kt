package printers

import LB12.Calculator
import console.Input
import console.inputHandlers.CalcHandler

/**
 * Calc task printer
 * Виводить інформацію про завданння 4 лабораторної роботи 12 та організовує взаємодію з користувачем
 */

class CalcTaskPrinter:Printer {
    val c = Calculator()
    var res:Double = 0.0

    override fun conditions(): Printer {
        println("Написати найпростіший калькулятор, що отримує на вхід 2 числа і операцію над" +
                " ними після чого повертає результат обчислень.")
        return this
    }

    override fun prompt(): Printer {
        println("Введіть дані у вигляді xyz, x - операнд 1, y - оператор(+,-,/,*), z - операнд 2:")
        return this
    }

    override fun input(): Printer {
        val (firstOperand, op, secondOperand) = Input.values(CalcHandler())
        res = c.calc(firstOperand.toDouble(), op.first(), secondOperand.toDouble())
        return this
    }

    override fun result() {
        println("Відповідь:\n$res")
    }
}