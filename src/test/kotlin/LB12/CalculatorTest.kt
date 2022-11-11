package LB12

import junit.framework.TestCase

class CalculatorTest : TestCase() {
    val c = Calculator()

    fun testCalc() {
        assertEquals(10.0, c.calc(5.0, '*', 2.0))
        assertEquals(8.1684, c.calc(2.129, '+', 6.0394))
        assertEquals(-14.0, c.calc(1728.0, '-', 1742.0))
        assertEquals(1.0, c.calc(12.0, '/', 12.0))
        assertEquals(3.0, c.calc(9.0, '/', 3.0))
    }
}