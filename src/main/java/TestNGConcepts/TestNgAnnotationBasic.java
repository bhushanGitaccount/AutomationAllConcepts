package TestNGConcepts;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNgAnnotationBasic {

    /*
        @BeforeSuite - This will run only once before suite
        @BeforeTest - This will execute only once before test case execution start even if we have multiple classes
        @BeforeClass - This will run before every class only once
        @BeforeMethod - This will run everytime before every testMethod (@test Method)
        @Test - Test cases execution
        @AfterMethod - This will run after every testMethod (@test Method)
        @AfterClass - This will run after every class only once
        @AfterTest - This will execute after All test completed inside packages(This can contain multiple classes)
        @AfterSuite - This will call after suite
    * */
    @BeforeSuite
    public void beforeSuit()
    {
        System.out.println("Inside Before Suite annotation ");
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Inside Before Test annotation");
    }
    @BeforeClass
    public void beforClass()
    {
        System.out.println("Inside Before class annotation ");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Inside Before Method ");
    }

    @Test
    public void test1()
    {
        System.out.println("Inside Test annotation Test 1 Method");
    }

    @Test
    public void test2()
    {
        System.out.println("Inside Test annotation Test 2 Method");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("Inside after method annotation ");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("Inside after class annotation ");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("Inside after Test annotation ");
    }



}
