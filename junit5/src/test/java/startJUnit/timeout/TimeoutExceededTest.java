package newInJUnit.timeout;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTimeout;

/** The first test is designed to be succeeded, due to the fact that we are expecting that a given
 * operation takes less than 2 minutes, and we are doing nothing there. On the other side, the second test
 * will fail, since we are expecting that a given operation takes a maximum of 10 millisecond, and
 * we are forcing it ti last 100 millisecond
 * */

public class TimeoutExceededTest {

  @Test
  void timeOutNotExceeded() {
    assertTimeout(Duration.ofMinutes(2), () -> {
      // Perform task that takes less that 2 minutes
    });
  }

  @Test
  void timeNotExceeded() {
    assertTimeout(Duration.ofMillis(10), () -> {
      Thread.sleep(100);
    });
  }
}
