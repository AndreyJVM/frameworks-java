package startJUnit.metaAnnotations;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("non-functional")
public class NonFunctionalTest {

    @Test
    @Tag("performance")
    @Tag("load")
    public void testOne() {
        System.out.println("Non-functional test 1 (Performance/Load)");
    }

    @Test
    @Tag("performance")
    @Tag("stress")
    public void testTwo() {
        System.out.println("Non-functional test 2 (Performance/Stress)");
    }

    @Test
    @Tag("security")
    public void testThree() {
        System.out.println("Non-functional test 3 (Security)");
    }

    @Test
    @Tag("usability")
    public void testFour() {
        System.out.println("Non-functional test 4 (Usability)");
    }
}