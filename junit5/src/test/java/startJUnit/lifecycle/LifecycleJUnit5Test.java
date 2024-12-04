package startJUnit.lifecycle;

import org.junit.jupiter.api.*;

/** This example defines two tests, and we define additional methods for the rest of the test
 * life cycle with annotations @BeforeAll, @BeforeEACH, @Test, @AfterEach, and @AfterAll
 * */

public class LifecycleJUnit5Test {

  @BeforeAll
  static void setupAll() {
    System.out.println("Setup ALL TESTS in the class");
  }

  @BeforeEach
  public void setupEach() {
    System.out.println("Setup EACH TESTS in the class");
  }

  @Test
  public void testOne() {
    System.out.println("TEST ONE");
  }

  @Test
  public void testTwo() {
    System.out.println("TEST TWO");
  }

  @AfterEach
  public void teardown(){
    System.out.println("Teardown EACH TEST in the class");
  }

  @AfterAll
  static void teardownAll(){
    System.out.println("Teardown ALL TEST in the class");
  }
}