package testng.groups;

import org.testng.annotations.Test;

public class TestNGGroupsTest1 {

    @Test(groups = {"smoke", "reg"})
    public void testGPT1_M1() {
        System.out.println("GPT1_M1");
    }

    @Test(groups = {"smoke", "reg"})
    public void testGPT1_M2() {
        System.out.println("GPT1_M2");
    }

    @Test(groups = {"smoke", "reg"})
    public void testGPT1_M3() {
        System.out.println("GPT1_M3");
    }

    @Test(groups = {"smoke"})
    public void testGPT1_M4() {
        System.out.println("GPT1_M4");
    }

    @Test(groups = "reg")
    public void testGPT1_M5() {
        System.out.println("GPT1_M5");
    }
}