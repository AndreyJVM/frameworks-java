package before.after.xxx;

import org.testng.annotations.*;

/**
 * Первый тест демонстрирующий работы аннотаций @BeforeXXX и @AfterXXX
 *
 * Методы не имеют сложной логики и нужны для информативности вывода
 *
 */

public class FirstTest extends BaseTest{

    @Test
    public void firstExampleMethodTest() {
        System.out.println("\t|\t|\t|\tClass name - " + getClass().getSimpleName() + " - firstExampleMethodTest ");
    }

    @Test
    public void secondExampleMethodTest() {
        System.out.println("\t|\t|\t|\tClass name - " + getClass().getSimpleName() + " - secondExampleMethodTest ");
    }

    @Test
    public void thirdExampleMethodTest(){
        System.out.println("\t|\t|\t|\tClass name - " + getClass().getSimpleName() + " - thirdExampleMethodTest ");
    }
}