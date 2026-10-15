package garbage;

import org.junit.jupiter.api.Test;

public class D {
    @Test
    public void test1(){
    A x =new A();
    x.aA();
    x.aB();
    B y = new B();
    y.bB();
    y.bC();
    C z = new C();
    z.cC();
    z.cD();
}
@Test
public void test2(){
        A x =new A();
        x.aA().aB().bB().bC().cC().cD();
}

}
