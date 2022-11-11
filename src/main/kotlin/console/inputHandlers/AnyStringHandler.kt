package console.inputHandlers

class AnyStringHandler:ValueHandler<String> {
    override fun handle(): String {
        return readLine()!!
    }
}