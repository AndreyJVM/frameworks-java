package startJUnit.repeated;

import org.junit.jupiter.api.RepeatedTest;

public class MyRepeatedTest {

    @RepeatedTest(5)
    public void simpleRepeatedFiveTest() {
        System.out.println("Repeated test");
    }
}