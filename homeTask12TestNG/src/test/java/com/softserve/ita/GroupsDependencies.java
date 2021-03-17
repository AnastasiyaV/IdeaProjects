package com.softserve.ita;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class GroupsDependencies {
    SoftAssert softAssert = new SoftAssert();
    @BeforeSuite
    public void beforeSuiteMethod() {
        System.out.println("This is BeforeSuite");
    }
    @BeforeTest
    public void beforeTestMethod() {
        System.out.println("--- This is BeforeTest");
    }
    @BeforeClass
    public void beforeClassMethod() {
        System.out.println("--- --- This is BeforeClass");
    }
    @BeforeGroups
    public void beforeGroupsMethod() {
        System.out.println("This is BeforeGroups");
    }
    @BeforeMethod
    public void beforeMethodMethod() {
        System.out.println("--- --- --- This is BeforeMethod");
    }
    @AfterGroups
    public void afterGroupsMethod(){
        System.out.println("This is AfterGroups");
    }

    @Test(groups = "A")
    public void testA1() {
        System.out.println("testA1");
        Assert.assertTrue(true);
    }
    @Test(groups = {"A", "B"})
    public void testA2B1() {
        System.out.println("testA2 and B1");
        softAssert.assertEquals(1,1);
        softAssert.assertFalse(1 ==2, "this is assertFalse 1 == 2");
    }
    @Test(groups = {"B"})
    public void testB1() {
        System.out.println("testB1");
        Assert.assertEquals(1,1);
    }
    @Test(groups = "A")
    public void testA3() {
        System.out.println("testA3");
        Assert.fail("testA3 failed");
    }
    @Test(groups = "A", dependsOnMethods = {"testA3"} /* , dependsOnGroups = {"B"}*/ )
    public void testC1() {
        System.out.println("testC1");
    }
    @Test(timeOut = 1000)
    public void timeoutErrorTest () throws InterruptedException {
        System.out.println("timeoutErrorTest");
        Thread.sleep(2000);
    }
}
