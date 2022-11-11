package LB12

import junit.framework.TestCase

class WeekdTest : TestCase() {
    fun testDayAt() {
        assertEquals(Weekd.MONDAY, Weekd.dayAt(0))
        assertEquals(Weekd.FRIDAY, Weekd.dayAt(4))
    }

    fun testNextDay() {
        assertEquals(Weekd.FRIDAY, Weekd.nextDay(3))
    }
}