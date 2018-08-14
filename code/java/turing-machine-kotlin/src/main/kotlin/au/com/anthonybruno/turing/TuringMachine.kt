package au.com.anthonybruno.turing

class TuringMachine(private val tape: Tape, private val procedure: Procedure) {

    companion object {
        val INITIAL_STATE = "initial"
    }

    private var currentState = INITIAL_STATE

    fun getCurrentState(): String {
        return currentState
    }

    fun getTape(): Array<String> {
        return tape.getSymbols()
    }

    fun run() {
        while (step());
    }

    /**
     * Computes a single step of the turing machine. If false is returned, it has reached a halting transition.
     */
    fun step(): Boolean {
        val transition = procedure.getTransition(currentState, tape.getCurrentSymbol()) ?: return false

        tape.writeSymbol(transition.newSymbol)
        if (transition.move == Direction.LEFT) {
            tape.moveLeft()
        } else if (transition.move == Direction.RIGHT) {
            tape.moveRight()
        }
        currentState = transition.nextState

        return true
    }

}