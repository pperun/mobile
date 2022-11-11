package LB07

import printers.DecimalValuesTaskPrinter
import printers.FactorialTaskPrinter
import printers.FibonacciTaskPrinter
import printers.PrinterLauncher
import console.Input
import console.inputHandlers.*

fun main() {
    var exit = false
    while(!exit) {
        println("Виберіть номер завдання: 1, 2, 3")
        when(Input.value(IntRangeHandler(1, 3))) {
            1 -> {
                PrinterLauncher.launch(FibonacciTaskPrinter())
            }
            2 -> {
                PrinterLauncher.launch(FactorialTaskPrinter())
            }
            3 -> {
                PrinterLauncher.launch(DecimalValuesTaskPrinter())
            }
        }
        println("Для виходу введіть 'exit'. Щоб продовжити натисніть Enter ще раз")
        exit = Input.value(ExitHandler())
    }
}