package TestNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityanDependonConcept {

    @Test(priority = 0)
    public void priority1()
    {
        System.out.println("Inside Test priority1");

    }

    @Test(priority = 2)
    public void priority2()
    {
        System.out.println("Inside Test priority2");

    }

    @Test(priority = 1)
    public void priority3()
    {
        System.out.println("Inside Test priority3");

    }
/*
* Execution will take place as per priority
* priority1
* priority3
* priority2
*
* Note : -
* If priority is not set then it will execute alphabetically
* And default priority is 0
* We can also give negative priority
* */
//-------------Depends on method concept---------------

    @Test
    public void loginPage()
    {
        System.out.println("Inside login page Test method");
        Assert.assertEquals("Bhushan","Bhushan1");
    }

    @Test(dependsOnMethods = {"loginPage"})
    public void homePage()
    {
        System.out.println("Inside Home page Test method");
    }

    @Test(dependsOnMethods = {"loginPage"})
    public void detailPage()
    {
        System.out.println("Inside Detail page Test method");
    }

    /*
    * In depends on method concepts
    * Test case will skip if the test case on which test case is depend is failed
    * for example
    * detailPage and homePage will skip because loginPage is failed
    * We can add multiple conditions as well
    * Ex : - If one test case is depend on two test case then we need to as follow
    *  @Test(dependsOnMethods = {"loginPage"},{"homePage"})
    * We can give priority and depends on method for same test case as follow
    *  @Test(priority = 1,dependsOnMethods = {"loginPage"})
    * */


}
