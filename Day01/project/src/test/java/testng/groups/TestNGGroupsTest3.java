package testng.groups;

import org.testng.annotations.Test;

public class TestNGGroupsTest3 {

    @Test(groups = {"reg"})
    public void testGPT3_M1() {
        System.out.println("GPT2_M1");
    }

    @Test(groups = {"smoke", "reg"})
    public void testGPT3_M2() {
        System.out.println("GPT2_M2");
    }

    @Test
    public void testGPT3_M3() {
        System.out.println("GPT2_M3");
    }

    @Test(groups = {"reg"})
    public void testGPT2_M4() {
        System.out.println("GPT2_M4");
    }
}