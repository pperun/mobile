package console.inputHandlers

import java.lang.IllegalArgumentException

/**
 * Alpha numeric handler
 * Обробник символьно-числових вхідних даних.
 * @return Повертає стрічку, яка інформує про те, що саме було введено
 */
class AlphaNumericHandler:ValueHandler<String> {
    override fun handle():String {
        val input = readLine()!!.trim()
        if(input.length > 1) throw IllegalArgumentException("Введіть 1 символ")
        val character = input[0]
        return if(character.isDigit()) "Цифра від 0 до 9"
        else if(!character.isUpperCase()) "Мала латинська літера"
        else if(character.isLetter()) "Лантинська літера"
        else "Некоректні дані"
    }
}