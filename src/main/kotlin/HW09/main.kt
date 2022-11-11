package HW09

fun main() {
    val g = Group("TI-92")
    val s1 = Student(
        "KB12345678",
        "Павло",
        "Перун",
        "Віталійович",
        Student.Companion.Faculty.IATE
    )
    val s2 = Student(
        "KB23456789",
        "Олександр",
        "Пупкін",
        "Олександрович",
        Student.Companion.Faculty.FBT
    )
    g.addStudent(s1)
    g.addStudent(s2)
    println(g.toString())

}