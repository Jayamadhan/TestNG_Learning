package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C3_MultipleTcs
{

    @Test
    public void tc3()
    {
        System.out.println("TC3");
    }

    @BeforeMethod
    public void beforehand1()
    {
        System.out.println("before method for tc3");
    }

    @Test(enabled=false,priority=1)
    public void tc33()
    {
        System.out.println("TC3-part2");
    }
}
