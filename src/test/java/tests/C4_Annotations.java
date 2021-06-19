package tests;

import org.testng.annotations.*;

public class C4_Annotations
{
    @BeforeSuite
    public void beforesuite()
    {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforestest()
    {
        System.out.println("Before test");
    }

    @BeforeClass
    public void beforeclass()
    {
        System.out.println("Before class");
    }

    @BeforeMethod
    public void beforeMETHOD()
    {
        System.out.println("Before method");
    }

    @Test
    public void test()
    {
        System.out.println("Current test");
    }

    @AfterSuite
    public void aftersuite()
    {
        System.out.println("after Suite");
    }

    @AfterTest
    public void afterstest()
    {
        System.out.println("after test");
    }

    @AfterClass
    public void afterclass()
    {
        System.out.println("after class");
    }

    @AfterMethod
    public void befoeMETHOD()
    {
        System.out.println("after method");
    }
}
