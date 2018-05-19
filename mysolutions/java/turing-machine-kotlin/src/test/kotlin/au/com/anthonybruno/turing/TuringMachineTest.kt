package au.com.anthonybruno.turing

import org.junit.Test
import kotlin.test.assertEquals

class TuringMachineTest {

    @Test
    fun basic() {
        val finalState = "halt"
        val transition = Transition(TuringMachine.INITIAL_STATE, "", finalState, "a", Direction.NONE)
        val tm = createTuringMachine(transition)
        tm.run()
        assertEquals(finalState, tm.getCurrentState())
    }

    @Test
    fun writeOnes() {
        val initT = Transition(TuringMachine.INITIAL_STATE, "", "a", "", Direction.NONE)
        val tA1 = Transition("a", "", "b", "1", Direction.RIGHT)
        val tB1 = Transition("b", "", "a", "1", Direction.LEFT)
        val tm = createTuringMachine(initT, tA1, tB1)
        tm.run()

        val numberOfOnes = tm.getTape().count { s -> s == "1" }
        assertEquals(2, numberOfOnes)
        assertEquals("a", tm.getCurrentState())

    }

    fun createTuringMachine(vararg transitions: Transition): TuringMachine {
       return TuringMachine(Tape(), Procedure(transitions.asList()))
    }

}
