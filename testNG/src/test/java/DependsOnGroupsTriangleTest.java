import org.testng.Assert;
import org.testng.annotations.Test;

/** Демонстрация атрибута groups, alwaysRun
* первый метод заведомо false, поэтому noTriangleTest игнорируется,
* а вот noTriangleAlwaysRunTest всё равно выполнится потому что имеет атрибут alwaysRun=true
* */
public class DependsOnGroupsTriangleTest {
    @Test(description = "Check input is triangle", groups = "triangle")
    public void triangleTest() {
        String result = Triangle.isTriangle("4 5 5");
        Assert.assertEquals(result, Triangle.TRIANGLE, "Input is triangle");
    }

    @Test(description = "Check input is equilateral triangle", groups = "triangle.spec")
    public void equilateralTriangleTest() {
        String result = Triangle.isTriangle("4 4 4");
        Assert.assertEquals(result, Triangle.EQUILATERAL, "Input is equilateral triangle");
    }

    @Test(description = "Check input is isosceles triangle", groups = "triangle.spec")
    public void isoscelesTriangleTest() {
        String result = Triangle.isTriangle("4 6 6");
        Assert.assertEquals(result, Triangle.ISOSCELES, "Input is isosceles triangle");
    }

    @Test(description = "Check input is not triangle",
            dependsOnGroups = "triangle*")
    public void noTriangleTest() {
        String result = Triangle.isTriangle("4 5 20");
        Assert.assertEquals(result, Triangle.NOT_TRIANGLE, "Input is not triangle");
    }

    @Test(description = "Check input is not triangle",
            dependsOnGroups = "triangle.*", alwaysRun = true)
    public void noTriangleAlwaysRunTest() {
        String result = Triangle.isTriangle("4 5 20");
        Assert.assertEquals(result, Triangle.NOT_TRIANGLE, "Input is not triangle");
    }
}