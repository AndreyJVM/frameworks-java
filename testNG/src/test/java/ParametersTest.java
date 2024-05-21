import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Тест демонстрирует работу с testng.xml, а именно с тегом parameter.
 *
 * Содержит два метода с разным количеством входных параметров
 * */

public class ParametersTest {
    @Parameters("Name")
    @Test
    public void testOneParameters(String name){
        System.out.println("Test one parameters - " + name);
    }

    @Parameters({"Name", "Age"})
    @Test
    public void testTwoParameters(String name, int age){
        System.out.println("Test two parameters: Name - " + name + " Age - " + age);
    }
}