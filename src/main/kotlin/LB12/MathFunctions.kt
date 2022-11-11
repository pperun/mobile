package LB12

/**
 * Math functions
 * Клас, який відповідає за обчислення математичної функції для завдання 5 лабораторної роботи 12
 */
class MathFunctions {
    /**
     * Min a b
     *
     * @param n Число, якому дорівнює рівнянн 5a-2b
     * @return Пара цілих чисел a, b, які є корнями рівняння
     */
    fun minAB(n:Int):Pair<Int, Int> {
        if(n <= 3) throw IllegalArgumentException("n <=3")
        for(a in 0..n) {
            for(b in 0..n) {
                if((5 * a - 2 * b) == n) {
                    return Pair(a, b)
                }
            }
        }
        return Pair(Int.MIN_VALUE, Int.MIN_VALUE)
    }
}