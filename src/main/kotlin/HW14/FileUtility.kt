package HW14

import java.io.*
import java.util.stream.Collectors

/**
 * Клас з методами-завданнями домашньої роботи №14
 */
class FileUtility {
    companion object {
        /**
         * Replace string
         * Метод, який замінює строку за номером [lineOrdinalNumber] строкою [replacement] у файлі [file]
         * @param file Файл, в якому відбудеться заміна
         * @param lineOrdinalNumber Порядковий номер строки
         * @param replacement Замінник строки
         */
        fun replaceString(file: File, lineOrdinalNumber:Int, replacement:String) {
            val lines = BufferedReader(FileReader(file)).use { it.readLines() }.toMutableList()
            lines[lineOrdinalNumber] = replacement
            BufferedWriter(FileWriter(file)).use {
                for(line in lines) {
                    it.write(line + "\n")
                }
            }
        }

        /**
         * Copy into bak
         * Метод копіювання файлу [file] в файл з таким самим ім'ям з форматом .bak
         * @param file Файл, який буде скопійовано
         */
        fun copyIntoBak(file:File) {
            val newFile = File(file.path.replace(file.extension, "bak"))
            newFile.createNewFile()
            file.copyTo(newFile, overwrite = true)
        }

        /**
         * Form file form odd lines
         * Формує новий файл з непарних строк файлу [file]
         * @param file Вхідний файл
         */
        fun formFileFormOddLines(file:File) {
            formFromLines(file, true)
        }

        /**
         * Form file from even lines
         * Формує новий файл з парних строк файлу [file]
         * @param file Вхідний файл
         */
        fun formFileFromEvenLines(file:File) {
            formFromLines(file, false)
        }

        /**
         * Form from lines
         * Формує новий файл з парних або непарних строк файлу [file]
         * @param file Вхідний файл
         * @param odd Флаг непарності строк
         */
        private fun formFromLines(file:File, odd:Boolean) {
            val lines = BufferedReader(FileReader(file)).use { it.readLines() }.toList()
            val newFile:File = if(odd)
                File(appendFileName(file, "_odd"))
            else
                File(appendFileName(file, "_even"))
            newFile.createNewFile()
            BufferedWriter(FileWriter(newFile)).use {
                if(odd)
                    for(i in lines.indices step 2)
                        it.write(lines[i] + "\n")
                else
                    for(i in 1 until lines.size step 2)
                        it.write(lines[i] + "\n")
            }
        }

        /**
         * Encode file
         * Зашифровує файл [file] за ключем [key]
         * @param file Файл
         * @param key Ключ
         */
        fun encodeFile(file:File, key:Int) {
            codec(file, key, true)
        }

        /**
         * Decode file
         * Розшифровує файл [file] за ключем [key]
         * @param file Файл
         * @param key Ключ
         */
        fun decodeFile(file:File, key:Int) {
            codec(file, key, false)
        }

        /**
         * Codec
         * Зашифровує або розшифровує файл [file] за ключем [key]
         * @param file Вхідний файл
         * @param key Ключ
         * @param encode Флаг шифровки/розшифровки
         */
        private fun codec(file:File, key:Int, encode:Boolean) {
            val lines = BufferedReader(FileReader(file)).use { it.readLines() }.toMutableList()
            for(i in lines.indices) {
                if(encode)
                    lines[i] = lines[i]
                        .chars()
                        .mapToObj{ ch -> Char(ch + key).toString() }
                        .collect(Collectors.joining())
                else
                    lines[i] = lines[i]
                        .chars()
                        .mapToObj{ ch -> Char(ch - key).toString() }
                        .collect(Collectors.joining())
            }
            BufferedWriter(FileWriter(file)).use {
                for(line in lines)
                    it.write(line + "\n")
            }
        }

        /**
         * Append file name
         * Додає до ім'я файлу [file] заданий текст
         * @param file Вхідний файл
         * @param text Текст
         * @return Нова назва файлу
         */
        private fun appendFileName(file:File, text:String):String {
            val ext = file.extension
            return file.path.replace(file.name, file.name.removeSuffix(".$ext") + "$text.$ext")
        }
    }
}