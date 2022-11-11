package printers

/**
 * Printer launcher
 *
 * Запускає pipeline для об'єктів,які імплементують інтерфейс [Printer]
 */
class PrinterLauncher {
    companion object {
        fun launch(f:Printer) {
            try {
                f.conditions().prompt().input().result()
            }
            catch (e:Exception) {
                e.printStackTrace()
            }
        }
    }
}