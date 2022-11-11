package printers

import HW14.FileUtility
import console.Input
import console.inputHandlers.AnyStringHandler
import console.inputHandlers.FileNameHandler
import console.inputHandlers.IntHandler
import java.io.File
import kotlin.properties.Delegates

class ReplaceFileStringTaskPrinter:Printer {
    private lateinit var file:File
    private var lineNum by Delegates.notNull<Int>()
    private lateinit var replacement:String


    override fun conditions(): Printer {
        println("Написати програму, що замінює підстрічку в файлі заданою стрічкою")
        return this
    }

    override fun prompt(): Printer {
        println("Введіть необхідні дані:")
        return this
    }

    override fun input(): Printer {
        println("Введіть ім'я файлу:")
        file = File(Input.value(FileNameHandler()))
        println("Введіть номер строки")
        lineNum = Input.value(IntHandler())
        println("Введіть строку")
        replacement = Input.value(AnyStringHandler())
        return this
    }

    override fun result() {
        FileUtility.replaceString(file, lineNum, replacement)
        println("Строка №$lineNum в файлі ${file.name} була замінена на строку '${replacement}'")
    }
}