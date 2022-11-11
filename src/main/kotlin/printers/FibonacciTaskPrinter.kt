package printers

import LB07.MathFunctions
import console.Input
import console.inputHandlers.IntHandler

/**
 * Fibonacci task printer
 * Виводить інформацію про завданння 1 лабораторної роботи 7 та організовує взаємодію з користувачем
 */
class FibonacciTaskPrinter:Printer {
    private val t: MathFunctions = MathFunctions()
    private var n: Int = 0

    override fun conditions(): FibonacciTaskPrinter {
        println("Програма має рахувати числа Фібоначі і виводити результати на екран")
        return this
    }

    override fun prompt(): FibonacciTaskPrinter {
        println("Введіть кількість чисел Фібоначі:")
        return this
    }


    override fun input(): FibonacciTaskPrinter {
        n = Input.value(IntHandler())
        return this
    }

    override fun result() {
        val output = StringBuilder("Відповідь:\n")
        for(i in 0..n)
            output.append(i.toString() + " - " + t.fibonacci(i) + "\n")
        println(output)
    }
}