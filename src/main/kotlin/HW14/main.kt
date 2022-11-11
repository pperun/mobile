package HW14

import console.Input
import console.inputHandlers.ExitHandler
import console.inputHandlers.IntRangeHandler
import printers.*

fun main() {
    var exit = false
    while(!exit) {
        println("Виберіть номер завдання: від 1 до 5 включно")
        when(Input.value(IntRangeHandler(1, 5))) {
            1 -> {
                PrinterLauncher.launch(ReplaceFileStringTaskPrinter())
            }
            2 -> {
                PrinterLauncher.launch(CopyFileTaskPrinter())
            }
            3 -> {
                PrinterLauncher.launch(FormFilesTaskPrinter())
            }
            4 -> {
                PrinterLauncher.launch(EncodeFileTaskPrinter())
            }
            5 -> {
                PrinterLauncher.launch(DecodeFileTaskPrinter())
            }
        }
        println("Для виходу введіть 'exit'. Щоб продовжити натисніть Enter ще раз")
        exit = Input.value(ExitHandler())
    }
}