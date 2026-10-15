package testng.assertions;

import org.junit.Test;
import org.testng.Assert;

public class TestNGAssertionTest1 {
    @Test
    public void testAssertEquals(){
        String actualResult ="Hello TestNG";
        Assert.assertEquals(actualResult,"Hello TestNG","failed string mismatch");
    }
    @Test
    public void testAssertionNotEquals(){
        String actualResult="HelloTestNG";
        Assert.assertNotEquals(actualResult,"Helo testng");
    }
    @Test
    public void testAssertionTrue(){
        boolean actualResult=false;
        Assert.assertTrue(actualResult);
    }
    @Test
    public void testAssertionFalse(){
        boolean actualresult=false;
        Assert.assertFalse(actualresult);
    }

}
