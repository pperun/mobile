package printers

import HW14.FileUtility
import console.Input
import console.inputHandlers.FileNameHandler
import java.io.File

class CopyFileTaskPrinter:Printer {
    private lateinit var file: File

    override fun conditions(): Printer {
        println("Написати програму, що копіює зміст текстового файлу в інший з розширення .bak." +
                " Назва файлу вводиться користувачем.")
        return this
    }

    override fun prompt(): Printer {
        println("Введіть ім'я файлу")
        return this
    }

    override fun input(): Printer {
        file = File(Input.value(FileNameHandler()))
        return this
    }

    override fun result() {
        FileUtility.copyIntoBak(file)
        println("Файл ${file.name} було скопійовано")
    }
}