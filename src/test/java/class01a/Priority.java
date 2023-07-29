package class01a;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 1)
    public void Atest() {
        System.out.println("A");
    }

    @Test(priority = 2)
    public void Btest() {
        System.out.println("B");
    }

    @Test(priority = 3)
    public void Ctest() {
        System.out.println("C");
    }
    @Test
    public void Dtest() {
        System.out.println("D");
}}
