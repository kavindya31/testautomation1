package testng.annotations;

import org.testng.annotations.Test;

public class TestNGAnnotationsTest5 {
    @Test
    public void testLogin() {
        System.out.println("login");
    }

    @Test
    public void testCreate() {
        System.out.println("create");
    }

    @Test
    public void testEdit() {
        System.out.println("edit");
    }

@Test
public void testLogout() {
    System.out.println("logout");
}}