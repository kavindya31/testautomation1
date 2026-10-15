package testng.groups;

import org.testng.annotations.Test;
public class TestNGGroupsTest4 {
    @Test(groups={"smoke","reg"})
    public void testGPT4_M1(){
        System.out.println("GPT2_M1");
    }
    @Test(groups={"smoke"})
    public void testGPT4_M2(){
        System.out.println("GPT2_M2");
    }
    @Test(groups={"reg"})
    public void testGPT4_M3(){
        System.out.println("GPT2_M3");
    }
    @Test
    public void testGPT4_M4(){
        System.out.println("GPT2_M4");
    }
    @Test(groups={"reg"})
    public void testGPT4_M5(){
        System.out.println("GPT2_M4");
    }
}
