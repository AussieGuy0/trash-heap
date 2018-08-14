import org.junit.Test;

import static org.junit.Assert.assertEquals;
import main.java.Greeter;

public class GreeterTest {

    @Test
    public void testThatGreeterReturnsTheCorrectGreeting() {
        assertEquals("Hello, World!", new Greeter().getGreeting());
    }

}
