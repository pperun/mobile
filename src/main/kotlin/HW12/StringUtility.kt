package HW12

import kotlin.streams.asStream

/**
 * String utility
 * Клас, який імплементує завдання домашнього завдання 12
 */
class StringUtility {
    companion object {
        /**
         * Регулярний вираз для чисел в стрічці
         */
        private val numberRegex = Regex("(\\d+)([ ,.^_]?)(\\d*)")
        /**
         * Регулярний вираз для слів в стрічці
         */
        private val wordRegex = Regex("([A-Za-z[\\p{Punct}&&[^ .,]]]+)([0-9]*)")
        /**
         * Регулярний вираз для знаків пунктуації в стрічці
         */
        private val trimPunctRegex = Regex("[^\\p{Punct}0-9\\n\\s]+")
        /**
         * Регулярний вираз для зайвих пробілів в стрічці
         */
        private val spacesRegex = Regex("[\\s]{2,}")
        /**
         * Регулярний вираз для слів, які починаються з великої літери в стрічці
         */
        private val upperCaseWordRegex = Regex("([A-Z]{1})" + wordRegex.pattern + "|([A-Z]{1})")

        /**
         * Метод для обчислення кількості слів в стрічці
         * @param text Вхідна стрічка
         * @return Кількість слів в стрічці [text]
         */
        fun wordsCount(text:String):Int =
            wordRegex
                .findAll(text)
                .count()

        /**
         * Метод для обчислення кількості чисел в стрічці
         * @param text Вхідна стрічка
         * @return Кількість чисел в стрічці [text]
         */
        fun numbersCount(text:String):Int =
            numberRegex
                .findAll(text)
                .count()

        /**
         * Метод для обрізання всіх символів, окрім літер в стрічці
         * @param text Вхідна стрічка
         * @return Стрічка з літер [text]
         */
        fun trimPunctuation(text:String):String =
            trimPunctRegex
                .findAll(text)
                .asStream()
                .map { e -> e.value }
                .reduce{ a, b -> "$a$b" }
                .get()

        /**
         * Метод для видалення зайвих пробілів в стрічці
         * @param text Вхідна стрічка
         * @return Стрічка без зайвих пробілів [text]
         */
        fun removeMultipleSpaces(text:String):String =
            spacesRegex
                .replace(text, " ")

        /**
         * Метод для виводу слів, які починаються з великої літери в стрічці
         * @param text Вхідна стрічка
         * @return Стрічка зі слів, які починаються з великої літери [text]
         */
        fun upperCaseWords(text:String):String =
            upperCaseWordRegex
                .findAll(text)
                .asStream()
                .map { e -> e.value }
                .reduce { a, b -> "$a $b" }
                .get()
    }


}