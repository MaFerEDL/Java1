package TESTNG_workshop;

import org.testng.annotations.Test;

public class TestNG
{
    @Test(priority = 1)
    void setup () {
        System.out.println("This is the Setup");
    }

    @Test(priority = 1)
    void testStep () {
        System.out.println("This is the test");
    }
    @Test(priority = 1)
    void tearDown () {
        System.out.println("This is the tearDown");
    }
}
