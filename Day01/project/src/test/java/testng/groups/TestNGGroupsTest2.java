package testng.groups;

import org.testng.annotations.Test;
public class TestNGGroupsTest2 {
    @Test(groups={"smoke"})
    public void testGPT2_M1(){
        System.out.println("GPT2_M1");
    }
    @Test(groups={"reg"})
    public void testGPT2_M2(){
        System.out.println("GPT2_M2");
    }
    @Test(groups={"smoke","reg"})
    public void testGPT2_M3(){
        System.out.println("GPT2_M3");
    }
}
