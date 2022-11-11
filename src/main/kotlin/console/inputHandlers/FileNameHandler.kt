package console.inputHandlers

import java.lang.IllegalArgumentException

class FileNameHandler:ValueHandler<String> {
    private val fileNameRegex = Regex("([\\w\\p{Punct}]+)(\\.)([\\w\\p{Punct}]+)")

    override fun handle(): String {
        val input = readLine()!!
        if(input.matches(fileNameRegex))
            return input
        else throw IllegalArgumentException("Некоректне ім'я файлу")
    }

}