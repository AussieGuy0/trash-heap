package au.com.anthonybruno.turing

class Tape(private val data: Array<String>) {

    private var currentPosition = 0

    constructor(): this(Array<String>(1024, {""}))

    fun getCurrentSymbol(): String {
        return data[currentPosition]
    }

    fun getSymbols(): Array<String> {
        return data.copyOf()
    }

    fun writeSymbol(symbol: String) {
        data[currentPosition] = symbol
    }


    fun moveRight(): Unit {
        currentPosition++
    }

    fun moveLeft(): Unit {
        if (currentPosition != 0) {
            currentPosition--
        }
    }


}