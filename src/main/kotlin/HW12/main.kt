package HW12

import console.Input
import console.inputHandlers.ExitHandler
import printers.PrinterLauncher
import printers.StringTaskPrinter

fun main() {
    var exit = false
    while(!exit) {
        PrinterLauncher.launch(StringTaskPrinter())
        println("Для виходу введіть 'exit'. Щоб продовжити натисніть Enter ще раз")
        exit = Input.value(ExitHandler())
    }
}