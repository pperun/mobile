package LB07

import junit.framework.TestCase

class MathFunctionsTest : TestCase() {
    val m:MathFunctions = MathFunctions()
    fun testFibonacci() {
        assertEquals(0, m.fibonacci(0))
        assertEquals(1, m.fibonacci(1))
        assertEquals(1, m.fibonacci(2))
        assertEquals(2, m.fibonacci(3))
        assertEquals(55, m.fibonacci(10))
    }

    fun testFactorial() {
        assertEquals(0, m.factorial(0))
        assertEquals(1, m.factorial(1))
        assertEquals(3_628_800, m.factorial(10))
    }

    fun testDecimalValues() {
        assertEquals(1, m.decimalValues(8))
        assertEquals(2, m.decimalValues(10))
        assertEquals(8, m.decimalValues(12_345_678))
    }
}