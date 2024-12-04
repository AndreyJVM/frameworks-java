package startJUnit.metaAnnotations;

import org.junit.jupiter.api.Test;

public class NonFunctionalTest {

    @Test
    @Load
    public void testOne() {
        System.out.println("Non-functional test 1 (Performance/Load)");
    }

    @Test
    @Stress
    public void testTwo() {
        System.out.println("Non-functional test 2 (Performance/Stress)");
    }

    @Test
    @Security
    public void testThree() {
        System.out.println("Non-functional test 3 (Security)");
    }

    @Test
    @Usability
    public void testFour() {
        System.out.println("Non-functional test 4 (Usability)");
    }
}