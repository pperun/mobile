package LB06

import junit.framework.TestCase

class MathFunctionsKtTest : TestCase() {

    fun testMax() {
        val values:List<Double> = listOf(1.0, 56.1, 4.0, -12.2, 32.0, 1.0, 3.444, 99.2)
        assertEquals(99.2, max(values))
        assertEquals(99.2, max(1.0, 56.1, 4.0, -12.2, 32.0, 1.0, 3.444, 99.2))
    }
    //a = 3 b = 4, c = 5, x = 1
    fun testEquation() {
        assertEquals(12.3, equation(3.2, 4.0, 5.1, 1.0))
        assertEquals(215.1, equation(3.2, 4.0, 5.1, 7.5))
    }

    fun testQuadraticEquation() {
        assertEquals(listOf(-4.0, 2.0), quadraticEquation(1.0, 2.0, -3.0, 5.0))
        assertEquals(listOf(-1.0, -1.0), quadraticEquation(2.0, 4.0, -3.0, -5.0))
        assertEquals(listOf(Double.NaN), quadraticEquation(0.0, 0.0, 10.0, 2.0))
        assertEquals(listOf(2.5), quadraticEquation(0.0, 2.0, 3.0, 8.0))
    }
}