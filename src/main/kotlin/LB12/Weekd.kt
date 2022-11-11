package LB12

/**
 * Weekd
 * Перечислення для репрезентації днів тижня
 */
enum class Weekd {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    companion object {
        fun dayAt(n:Int):Weekd = values()[n]
        fun nextDay(n:Int):Weekd = if(n == 6) values()[0] else dayAt(n + 1)
    }

}