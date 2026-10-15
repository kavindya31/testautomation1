package testng.priority;

import org.testng.annotations.Test;

public class TestNGDependsOnMethodsTest {

    @Test
    public void testLogin() {
        System.out.println("login");
    }

    @Test(dependsOnMethods = {"testLogin"})
    public void testCreate() {
        System.out.println("create");
    }

    @Test(dependsOnMethods = {"testLogin","testCreate"})
    public void testEdit() {
        System.out.println("edit");
    }

    @Test(dependsOnMethods = {"testEdit"})
    public void testDelete() {
        System.out.println("delete");
    }

    @Test(dependsOnMethods = {"testDelete"})
    public void testLogout() {
        System.out.println("logout");
    }
}
