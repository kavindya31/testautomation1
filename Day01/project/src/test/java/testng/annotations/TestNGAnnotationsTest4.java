package testng.annotations;

import org.testng.annotations.*;

public class TestNGAnnotationsTest4 {
    @BeforeMethod
    public void setUp() {
        System.out.println("Before methode");

    }
    @Test
    public void test1() {
        System.out.println("test 1");
    }

    @Test
    public void test2() {
        System.out.println("test 2");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Methode");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeclass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterclass");
    }
}
