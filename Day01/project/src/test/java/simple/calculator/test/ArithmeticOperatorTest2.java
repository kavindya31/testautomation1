package simple.calculator.test;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest2 {
    ArithmeticOperator calc;//calc IS VARIABLE
    @BeforeMethod
    public void setUP(){
        // ArithmeticOperator clac = new ArithmeticOperator();
        calc=new ArithmeticOperator();
    }

    @Test(dataProvider = "getData")
    public void testSum1(int num1,int num2,int result) {
        int actualValue = calc.sum(num1,num2);
        Assert.assertEquals(actualValue,result);
    }
    @DataProvider
    public Object[][] gwtData(){
        return new Object[][]{
                {100,200,300},
                {-100,-2000,-300},
                {0,10,10},
                {0,-10,-10}

        };
    }

}
