package startJUnit.timeout;

import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

/** In the first test, assertTimeout evaluates a piece of code as a lambda expression in a
 * given timeout, obtaining its result. In the second test, assertTimeout evaluates a method
 * in a given timeout, obtaining its result:
 * */
public class TimeoutWithResultOrMethodTest {

  @Test
  void timeoutNotExceededWithResult() {
    String actualResult = assertTimeout(ofMinutes(1), () -> {
      return "hi there";
    });

    assertEquals("hi there", actualResult);
  }

  @Test
  void timeoutNotExceededWithMethod() {
    String actualGreeting = assertTimeout(ofMinutes(1),
            TimeoutWithResultOrMethodTest::greeting);
    assertEquals("hello world!", actualGreeting);
  }

  private static String greeting() {
    return "hello world!";
  }
}
