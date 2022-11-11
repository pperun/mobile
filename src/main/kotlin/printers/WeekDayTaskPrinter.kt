package printers

import LB12.Weekd
import console.Input
import console.inputHandlers.IntRangeHandler

/**
 * Week day task printer
 * Виводить інформацію про завданння 2 лабораторної роботи 12 та організовує взаємодію з користувачем
 */

open class WeekDayTaskPrinter:Printer {
    protected var d = 0

    override fun conditions(): WeekDayTaskPrinter {
        println("Написати програму, що у відповідь на введення номера дня виводить текстове подання дня тижня.")
        return this
    }

    override fun prompt(): WeekDayTaskPrinter {
        println("Введіть порядковий номер дня тижня(від 1 до 7):")
        return this
    }

    override fun input(): WeekDayTaskPrinter {
        d = Input.value(IntRangeHandler(1, 7))
        return this
    }

    override fun result() {
        println("Відповідь:\n ${Weekd.dayAt(d - 1)}")
    }
}