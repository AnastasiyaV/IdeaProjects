package com.softserve.ita;
import org.testng.annotations.*;

public class ArticleTest {
    @BeforeMethod
    public void setUp() {
        System.out.println("BeforeMethod in ArticleTest");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("AfterMethod in ArticleTest");
    }

    @Test
    public void firstTest() {
        System.out.println("this is firstTest in ArticleTest");
    }
}
