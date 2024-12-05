package startJUnit.nested;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@Nested
public class InnerClassTwo {
    @Test
    public void innerTest2 () {
        System.out.println("Test 3");
    }
}