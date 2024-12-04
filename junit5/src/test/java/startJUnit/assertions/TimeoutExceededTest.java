package startJUnit.assertions;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TimeoutExceededTest {

    @Test
    public void timeoutNotExceededTest() {
        assertTimeout(Duration.ofMinutes(2), () -> {
            // Perform task that takes less than 2 minutes
        });
    }

    @Test
    public void timeoutExceededTest() {
        assertTimeout(Duration.ofMinutes(10), () -> {
            Thread.sleep(100);
        });
    }
}