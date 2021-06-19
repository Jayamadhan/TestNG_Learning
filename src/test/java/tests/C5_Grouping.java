package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C5_Grouping
{

    @Test(groups="sanity")
    public void tc1()
    {
        System.out.println("TC1");
    }

    @Test(groups="regression")
    public void tc2()
    {
        System.out.println("tc2");
    }

    @Test(groups={"sanity","regression"})
    public void tc3()
    {
        System.out.println("Tc3");
    }

    @BeforeMethod(alwaysRun = true)
    public void befoer()
    {
        System.out.println("before method");


    }

    @AfterMethod
    public void after()
    {
        System.out.println("after");
    }
}
