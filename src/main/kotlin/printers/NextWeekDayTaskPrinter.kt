package printers

import LB12.Weekd

/**
 * Next week day task printer
 * Виводить інформацію про завданння 3 лабораторної роботи 12 та організовує взаємодію з користувачем
 */

class NextWeekDayTaskPrinter: WeekDayTaskPrinter() {
    override fun conditions(): WeekDayTaskPrinter {
        println("Написати функцію обчислення за днем тижня (типу Weekd) наступного за ним дня.")
        return this
    }

    override fun result() {
        println("Відповідь:\n ${Weekd.nextDay(d - 1)}")
    }
}