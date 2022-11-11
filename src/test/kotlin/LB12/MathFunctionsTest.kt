package LB12

import junit.framework.TestCase


class MathFunctionsTest : TestCase() {
    val m = MathFunctions()

    fun testMinAB() {
        assertEquals(Pair(1, 0), m.minAB(5))
        assertEquals(Pair(2, 0), m.minAB(10))
        assertEquals(Pair(10, 2), m.minAB(46))
    }
}