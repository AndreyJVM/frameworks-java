package before.after.groups;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterGroups;

public class BaseTest {

    @BeforeGroups(groups = {"first-groups"})
    public void beforeFirstGroups(){
        System.out.println("Class - " + getClass().getSimpleName() + " -> @BeforeGroups");
    }
    @BeforeGroups(groups = {"second-groups"})
    public void beforeSecondGroups(){
        System.out.println("Class - " + getClass().getSimpleName() + " -> @BeforeGroups");
    }

    @AfterGroups(groups = {"first-groups"})
    public void afterFirstGroups(){
        System.out.println("Class - " + getClass().getSimpleName() + " -> @AfterGroups");
    }

    @AfterGroups(groups = {"second-groups"})
    public void afterSecondGroups(){
        System.out.println("Class - " + getClass().getSimpleName() + " -> @AfterGroups");
    }
}
