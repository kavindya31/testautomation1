package garbage;

public class B {

    public void b(){
        System.out.println("a");
    }

    public B bB(){
        System.out.println("aA");
        return this;
    }

    public C bC(){
        System.out.println("bC");
        return new C();
    }
}
