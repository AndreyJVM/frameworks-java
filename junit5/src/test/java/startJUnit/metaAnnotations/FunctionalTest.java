package startJUnit.metaAnnotations;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("functional")
public class FunctionalTest {

    @Test
    public void functionalTestOne() {
        System.out.println("Functional test 1");
    }

    @Test
    public void functionalTestTwo() {
        System.out.println("Functional test 2");
    }
}