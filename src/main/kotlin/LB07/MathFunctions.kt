package LB07

/**
 * Math functions
 *
 * Клас з реалізаціями завдань лабораторної роботи 7
 */
class MathFunctions {
    /**
     * Fibonacci
     *
     * Обчислює число Фібоначі по заданому порядковому номеру
     * @param n Порядковий номер числа Фібоначі в послідовності Фібоначі
     * @return Число, яке відповідає позиції n в послідовності Фібоначі
     */
    fun fibonacci(n:Int): Int {
        if(n <= 1)
            return n
        return fibonacci(n -1) + fibonacci(n - 2)
    }

    /**
     * Factorial
     *
     * Обчислює факторіал числа
     * @param n Число
     * @return Факторіал числа n
     */
    fun factorial(n:Int):Int = if(n > 1) n * factorial(n - 1) else n

    /**
     * Decimal values
     * Обчислює кількість десяткових цифр натурального числа
     * @param n Натуральне число
     * @return Кількість десяткових цифр натурального числа
     */
    fun decimalValues(n:Int):Int {
        var temp = n
        var res = 0
        while(temp != 0) {
            temp /= 10
            res++;
        }
        return res;
    }
}