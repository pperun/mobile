package HW09


/**
 * Group
 *
 * Клас репрезентації групи студентів
 *
 * @property groupName Назва групи
 */
class Group (private val groupName:String) {
    private val students:MutableList<Student> = mutableListOf()

    fun addStudent(student:Student):Boolean = students.add(student)
    fun removeStudent(student:Student) = students.remove(student)
    fun getStudentAt(index:Int) = students[index]
    fun getStudents() = students

    override fun toString(): String {
        return "Group(groupName='$groupName', students=$students)"
    }


}