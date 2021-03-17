package com.softserve.ita;
import org.testng.annotations.*;

public class TestWithParameters {
    @Parameters({"id1", "param2"})
    @Test
    public void paramXmlTest (int id1, String param2) {
        //System.out.println("Level : " + level + " - " + description );
        System.out.println(String.format("paramXmlTest: id - %d, name - %s", id1, param2));
    }


    @Test(dataProvider = "getData")
    public void instanceDataProviderTest (int id, String name) {
        System.out.println(String.format("DataProviderExample: id - %d, name - %s", id, name));
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {1, "Shawn Cardenas"},
                {2, "Rhonda Pruitt"},
                {3, "Timothy Redmond"}
        };
    }

}
