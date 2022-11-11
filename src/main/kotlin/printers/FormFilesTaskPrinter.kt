package printers

import HW14.FileUtility
import console.Input
import console.inputHandlers.FileNameHandler
import java.io.File

class FormFilesTaskPrinter:Printer {
    private lateinit var file: File
    override fun conditions(): Printer {
        println("Написати програму, що відкриває файл на читання і формує два інших файли.\n" +
                "Перший файл формується з непарних стрічок початкового файлу, а інший з парних.")
        return this
    }

    override fun prompt(): Printer {
        println("Введіть ім'я файлу:")
        return this
    }

    override fun input(): Printer {
        file = File(Input.value(FileNameHandler()))
        return this
    }

    override fun result() {
        FileUtility.formFileFormOddLines(file)
        FileUtility.formFileFromEvenLines(file)
        println("Сформовано 2 файли")
    }
}