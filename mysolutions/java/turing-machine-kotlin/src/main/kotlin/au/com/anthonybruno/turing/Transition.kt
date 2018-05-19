package au.com.anthonybruno.turing

data class Transition(val initialState: String, val input: String, val nextState: String, val newSymbol: String, val move: Direction) {

}
