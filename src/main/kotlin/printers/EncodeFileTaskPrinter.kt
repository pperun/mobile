package printers

import HW14.FileUtility
import console.Input
import console.inputHandlers.FileNameHandler
import console.inputHandlers.IntHandler
import java.io.File

class EncodeFileTaskPrinter:Printer {
    private lateinit var file: File
    private var key:Int = 0

    override fun conditions(): Printer {
        println("Здійснити шифрування файлу використовуючи зсув символів.")
        return this
    }

    override fun prompt(): Printer {
        println("Введіть дані:")
        return this
    }

    override fun input(): Printer {
        println("Введіть ім'я файлу:")
        file = File(Input.value(FileNameHandler()))
        println("Введіть ключ шифрування:")
        key = Input.value(IntHandler())
        return this
    }

    override fun result() {
        FileUtility.encodeFile(file, key)
        println("Файл ${file.name} зашифровано")
    }
}