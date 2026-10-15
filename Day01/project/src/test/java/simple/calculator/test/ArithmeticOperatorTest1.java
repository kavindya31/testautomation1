package simple.calculator.test;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest1 {
    ArithmeticOperator calc;//calc IS VARIABLE
    @BeforeMethod
    public void setUP(){
        // ArithmeticOperator clac = new ArithmeticOperator();
        calc=new ArithmeticOperator();
    }

    @Test
    public void testSum1() {
        int actualValue = calc.sum(100,200);
        Assert.assertEquals(actualValue,300);
    }
    @Test
    public void testSum2() {
        int actualValue = calc.sum(-100,-2000);
        Assert.assertEquals(actualValue,-300);
    }
    @Test
    public void testSum3() {
        int actualValue = calc.sum(0,10);
        Assert.assertEquals(actualValue,10);
    }
    @Test
    public void testSum4() {
        int actualValue = calc.sum(0,-10);
        Assert.assertEquals(actualValue,-10);
    }

}
