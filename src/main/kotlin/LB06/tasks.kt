package LB06

import kotlin.math.pow
import kotlin.math.sqrt

fun task1(a:Double, b:Double, c:Double, d:Double, x:Double) {
    println("Функція y = MAX(a, b, c, d) => Відповідь: ${max(a, b, c, d)}\n" +
            "Функція y = x^4 => Відповідь: ${x.pow(4)}\n" +
            "Функція y = ax^2 + bx + c => Відповідь: ${equation(a, b, c, x)}")
}

fun task2(a:Double, b:Double, c:Double, d:Double, y:Double) {
    println("Функція y = x^4 => Відповідь: ${sqrt(sqrt(y))}\n" +
            "Функція y = ax^2 + bx + c => Відповідь: ${quadraticEquation(a, b, c, y)}\n" +
            "Функція y = ax + c => Відповідь: ${quadraticEquation(a=0.0, b=a, c, y)}"
    )
}