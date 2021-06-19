package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C1_FirstTestNGClass

{
    @Test
    public void tc1()
    {
        System.out.println("TC1");
        //Assert.assertTrue(false);
    }



    @Test(dependsOnMethods="tc1")
    public void tc2()
    {
        System.out.println("TC2");
        //Assert.assertTrue(false);
    }

    @BeforeMethod
    public void beforecode1()
    {
        System.out.println("before method for tc1");
    }


    @AfterMethod
    public void aftercode1()
    {
        System.out.println("After method for tc1");
    }

}
