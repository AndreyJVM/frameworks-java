package before.after.groups;

import org.testng.annotations.Test;

@Test(groups = {"first-groups"})
public class FirstTest extends BaseTest{
    @Test
    public void firstExampleMethodTest() {
        System.out.println("\tClass name - " + getClass().getSimpleName() + " - firstExampleMethodTest ");
    }

    @Test
    public void secondExampleMethodTest() {
        System.out.println("\tClass name - " + getClass().getSimpleName() + " - secondExampleMethodTest ");
    }

    @Test
    public void thirdExampleMethodTest(){
        System.out.println("\tClass name - " + getClass().getSimpleName() + " - thirdExampleMethodTest ");
    }

    @Test(groups = {"second-groups"})
    public void fourthExampleMethodTest(){
        System.out.println("\tClass name - " + getClass().getSimpleName() + " - fourthExampleMethodTest ");
    }
}
