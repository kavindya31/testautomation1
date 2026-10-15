package simple.calculator.test;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest {
    ArithmeticOperator calc;//calc IS VARIABLE
    @BeforeMethod
    public void setUP(){
       // ArithmeticOperator clac = new ArithmeticOperator();
        calc=new ArithmeticOperator();
    }


    @Test
    public void testSum() {
        int actualValue = calc.sum(100,200);
        Assert.assertEquals(actualValue,300);
    }

    @Test
    public void testSum1() {
        Assert.assertEquals(calc.sum(100,200),300);
        Assert.assertEquals(calc.sum(-100,-200),-300);
        Assert.assertEquals(calc.sum(0,10),10);
        Assert.assertEquals(calc.sum(0,-10),-10);
    }
}
