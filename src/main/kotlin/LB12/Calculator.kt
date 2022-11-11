package LB12

import kotlin.math.pow

/**
 * Calculator
 * Простий калькулятор для обчислення операцій між двома операндами (+,-,/,*,^)
 */

class Calculator {
    fun calc(firstOperand:Double, operation:Char, secondOperand:Double):Double {
        return when(operation) {
            '+' -> firstOperand + secondOperand
            '-' -> firstOperand - secondOperand
            '*' -> firstOperand * secondOperand
            '/' -> firstOperand / secondOperand
            '^' -> firstOperand.pow(secondOperand)
            else -> throw IllegalArgumentException("Некоректний оператор")
        }
    }
}