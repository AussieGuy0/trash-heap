package au.com.anthonybruno.turing

class Procedure(private val transitions: List<Transition>){

    fun getTransition(state: String, input: String): Transition? {
        return transitions.firstOrNull { it.initialState == state && it.input == input }
    }
}