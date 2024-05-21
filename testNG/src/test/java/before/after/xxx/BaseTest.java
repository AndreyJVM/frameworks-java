package before.after.xxx;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;
/**
 * Вспомогательный тест демонстрирующий работы аннотаций @BeforeXXX и @AfterXXX
 *
 * */
public class BaseTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Class - " + getClass().getSimpleName() + " -> @BeforeSuite \n");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("\tClass - " + getClass().getSimpleName() + " -> @BeforeTest ");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("\t|\tClass - " + getClass().getSimpleName() + " -> @BeforeClass ");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("\t|\t|\tClass - " + getClass().getSimpleName() + " -> @BeforeMethod ");
    }
    /*----------------------------------------------------------------------------------------------------------------------*/
    /*----------------------------------------------------------------------------------------------------------------------*/
    @AfterSuite
    public void afterSuite() {
        System.out.println("Class - " + getClass().getSimpleName() + " -> @AfterSuite ");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("\tClass - " + getClass().getSimpleName() + " -> @AfterTest \n");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("\t|\tClass - " + getClass().getSimpleName() + " -> @AfterClass ");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("\t|\t|\tClass - " + getClass().getSimpleName() + " -> @AfterMethod ");
    }
}