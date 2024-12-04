package startJUnit.os;

import org.junit.jupiter.api.Test;

public class DisabledOnOSTest {

    @DisabledOnOS({OS.MAC, OS.LINUX})
    @Test
    public void conditionalTest() {
        System.out.println("This test will be disabled on MAC and LINUX");
    }
}