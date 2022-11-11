package console

import console.inputHandlers.ValueHandler
import console.inputHandlers.ValuesHandler

/**
 * Input
 *
 * Клас вводу та обробки даних від користувача
 */

class Input {
    companion object {
        /**
         * Values
         *
         * @param T Бажаний тип значень, які вводить користувач, і в який буде перетворено строку
         * @param handler Обробник для інформації, яка вводиться користувачем
         * @return Повертає список значень типу [T], які вводив користувач
         */
        fun <T> values(handler:ValuesHandler<T>):List<T> {
            while(true) {
                try {
                    return handler.handle()
                }
                catch (e:Exception) {
                    println("${e}. Спробуйте ще раз")
                }
            }
        }
        /**
         * Value
         *
         * @param T Бажаний тип значення, яке вводить користувач, і в який буде перетворено строку
         * @param handler Обробник для інформації, яка вводиться користувачем
         * @return Повертає одне значення типу [T], які вводив користувач
         */
        fun <T> value(handler:ValueHandler<T>): T {
            while(true) {
                try {
                    return handler.handle()
                }
                catch (e:Exception) {
                    println("${e}. Спробуйте ще раз")
                }
            }
        }
    }
}