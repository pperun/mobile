package console.inputHandlers

/**
 * Value handler
 * Функціональний інтерфейс обробника для одиноких значень
 * @param T Бажаний тип значень, які вводить користувач, і в який буде перетворено строку
 */
fun interface ValueHandler<T> {
    fun handle(): T
}