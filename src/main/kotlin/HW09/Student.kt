package HW09

import java.lang.IllegalArgumentException

/**
 * Student
 *
 * Клас репрезнтації студента НТУУ "КПІ"
 *
 * @property studentID Номер студентського квитка студента
 * @property name Ім'я студента
 * @property surname Прізвище студента
 * @property patronymic По батькові студента
 * @property faculty Факультет
 */
class Student
    (private var studentID:String,
     private var name:String,
     private var surname:String,
     private var patronymic:String,
     private var faculty:Faculty) {

    init {
        if(!validID(studentID)) throw IllegalArgumentException("Некорректний ID. Правильний формат => KB12345678")
    }

    companion object {
        val university = "Національний технічний університет України" +
                "\"Київський політехнічний інститут імені Ігоря Сікорського\""

        enum class Faculty(private val f:String) {
            IATE("Навчально-науковий інститут атомної та теплової енергетики"),
            RTF("Радiотехнiчний факультет"),
            FBT("Факультет бiотехнологiї i бiотехнiки"),
            FMF("Фiзико-математичний факультет");

            override fun toString(): String {
                return this.name + "(" + this.f + ")"
            }
        }
    }

    private fun validID(id:String):Boolean {
        return id.matches("KB[0-9]{8}".toRegex())
    }

    override fun toString(): String {
        return "Student(studentID='$studentID', name='$name', surname='$surname', patronymic='$patronymic', faculty='$faculty')"
    }
}