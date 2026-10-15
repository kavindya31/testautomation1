package testng.annotations;

import org.junit.Test;

public class TestNGAnnotationsTest1 {
    public static void main(String[] args) {
        System.out.println("print 1");
    }

    public void print() {
        System.out.println("print 2");
    }


    @Test
    public void print2() {
        System.out.println("print 3");
    }
}