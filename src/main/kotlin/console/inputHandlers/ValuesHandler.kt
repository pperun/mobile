package console.inputHandlers
/**
 * Values handler
 * Функціональний інтерфейс обробника для багатьох значень, які вводяться одночасно
 * @param T Бажаний тип значень, які вводить користувач, і в який буде перетворено строку
 */
interface ValuesHandler<T> {
    fun handle():List<T>
}