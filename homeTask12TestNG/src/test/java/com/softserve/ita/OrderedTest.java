package com.softserve.ita;

import org.testng.annotations.Test;

public class OrderedTest {

        @Test(priority = 3)
        public void firstTest() {
            System.out.println("firstTest, priority #3");
        }

        @Test (priority = 2)
        public void secondTest() {
            System.out.println("thirdTest, priority #2");
        }

        @Test (priority = 1)
        public void thirdTest() {
            System.out.println("thirdTest, priority #1");
        }
}
