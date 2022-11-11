package LB06

import console.Input
import console.inputHandlers.ExitHandler
import console.inputHandlers.IntHandler
import console.inputHandlers.TaskValuesHandler


fun main(args: Array<String>) {
    var exit = false
    while(!exit) {
        println("Виберіть номер завдання: 1 або 2")
        val task = Input.value(IntHandler())
        if(task == 1) {
            println("Введіть значення a, b, c, d, x, розділені комою або пробілом")
            try {
                val (a, b, c, d, x) = Input.values(TaskValuesHandler())
                task1(a, b, c, d, x)
            }
            catch (e:Exception) {
                println("${e.message}")
            }
        }
        else if(task == 2) {
            println("Введіть значення a, b, c, d, y, розділені комою або пробілом")
            try {
                val (a, b, c, d, x) = Input.values(TaskValuesHandler())
                task2(a, b, c, d, x)
            }
            catch (e:Exception) {
                println("${e.message}")
            }
        }
        println("Для виходу введіть 'exit'. Щоб продовжити натисніть Enter ще раз")
        exit = Input.value(ExitHandler())
    }

}