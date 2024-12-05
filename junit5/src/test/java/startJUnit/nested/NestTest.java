package startJUnit.nested;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NestTest {

    @BeforeEach
    public void setup1() {
        System.out.println("Setup 1");
    }

    @Test
    public void topTest() {
        System.out.println("Test 1");
    }

}
