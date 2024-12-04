package startJUnit.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {

    @Test
    public void exceptionTesting() {
        Throwable exception =
                assertThrows(IllegalArgumentException.class,
                        () -> {
                    throw new IllegalArgumentException("a message");});

        assertEquals("a message", exception.getMessage());
    }
}