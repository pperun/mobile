package LB06

import kotlin.math.pow
import kotlin.math.sqrt

/**
 * @param values Довільна кількість чисел типу [Double]
 * @return Повертає максимальне значення із [values]
 */
fun max(vararg values:Double): Double {
    var max:Double = Double.MIN_VALUE
    values.forEach { value -> if(value > max) max = value}
    return max
}

/**
 * @param values Список чисел типу [Double]
 * @return Повертає максимальне значення із [values]
 */
fun max(values:List<Double>): Double {
    var max:Double = Double.MIN_VALUE
    values.forEach { value -> if(value > max) max = value}
    return max
}

/**
 * @param a Коефіцієнт рівняння [a]
 * @param b Коефіцієнт рівняння [b]
 * @param c Коефіцієнт рівняння [c]
 * @param x Незалежна змінна [x]
 *
 * @return Повертає результат рівняння вигляду y = ax^2+bx+c, де x - відома величина
 */
fun equation(a:Double, b:Double, c:Double, x:Double) = a * x.pow(2) + b * x + c

/**
 * @param a Коефіцієнт рівняння [a]
 * @param b Коефіцієнт рівняння [b]
 * @param c Коефіцієнт рівняння [c]
 * @param y Залежна змінна [y]
 *
 * @return Повертає корені типового квадратного рівняння типу y = ax^2+bx+c, де y - відома величина
 */
fun quadraticEquation(a:Double = 0.0, b:Double = 0.0, c:Double, y:Double): List<Double> {
    if(a == 0.0 && b == 0.0) return listOf(Double.NaN)
    if(a == 0.0) return listOf((y - c) / b)
    if(b == 0.0) return listOf(sqrt((y - c) / a))
    val d:Double = b.pow(2) - 4 * a * (c - y)
    return if(d < 0) listOf()
    else listOf((-b - sqrt(d)) / (2 * a), (-b + sqrt(d)) / (2 * a))
}