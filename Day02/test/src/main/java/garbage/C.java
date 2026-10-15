package garbage;

import org.junit.jupiter.api.Test;

public class C {

    public void c(){
        System.out.println("a");
    }

    public C cC(){
        System.out.println("aA");
        return this;
    }

    public D cD(){
        System.out.println("cD");
        return new D();
    }

}
