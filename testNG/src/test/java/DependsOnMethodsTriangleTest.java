import org.testng.Assert;
import org.testng.annotations.Test;

/** Установим зависимости по порядку:
 * второй от первого
 * третий от второго
 * четвёртый от второго и третьего
 *
 * В классе методы настроены по следующему прицепу, первый метод выдаст ошибку, а последующие просто игнорируются
 * */
public class DependsOnMethodsTriangleTest {
    @Test(description = "Check input is triangle")
    public void triangleTest() {
        String result = Triangle.isTriangle("4 5 5");
        Assert.assertEquals(result, Triangle.TRIANGLE, "Input is triangle");
    }

    @Test(description = "Check input is equilateral triangle", dependsOnMethods = "triangleTest")
    public void equilateralTriangleTest() {
        String result = Triangle.isTriangle("4 4 4");
        Assert.assertEquals(result, Triangle.EQUILATERAL, "Input is equilateral triangle");
    }

    @Test(description = "Check input is isosceles triangle", dependsOnMethods = "equilateralTriangleTest")
    public void isoscelesTriangleTest() {
        String result = Triangle.isTriangle("4 6 6");
        Assert.assertEquals(result, Triangle.ISOSCELES, "Input is isosceles triangle");
    }

    @Test(description = "Check input is not triangle",
            dependsOnMethods = {"isoscelesTriangleTest", "equilateralTriangleTest"})
    public void noTriangleTest() {
        String result = Triangle.isTriangle("4 5 20");
        Assert.assertEquals(result, Triangle.NOT_TRIANGLE, "Input is not triangle");
    }
}