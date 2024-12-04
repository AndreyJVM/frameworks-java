package startJUnit.timeout;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class TimeoutWithPreemptiveTerminationTest {

  /** The test will fail since we are simulating an operation which last 100 milliseconds,
   * and we have defined a timeout is exceeded
   */
  @Test
  void timeoutExceededWithPreemptiveTermination() {
    assertTimeoutPreemptively(Duration.ofMillis(10), () -> {
      Thread.sleep(100);
    });
  }
}