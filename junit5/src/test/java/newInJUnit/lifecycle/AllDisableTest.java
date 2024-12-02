package lifecycle;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * */

@Disabled("All test in this class will be skipped")
public class AllDisableTest {

  @Test
  public void testOne() {
    System.out.println("TEST ONE");
  }

  @Test
  public void testTwo() {
    System.out.println("TEST TWO");
  }
}