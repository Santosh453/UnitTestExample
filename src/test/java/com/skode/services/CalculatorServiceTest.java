//package com.skode.services;
//
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorServiceTest {
//
//    //@BeforeClass
//    @BeforeClass   // Before all test Cases
//    public static void init(){
//        System.out.println("Before all test cases:");
//        System.out.println("Started test: " + new Date());
//    }
//
//
//    // test method of addTwoNumbers
//    @Test
//    public void addTwoNumbersTest(){
//        System.out.println("Before all test cases: addTwoNumbersTest");
//        int result = CalculatorService.addTwoNumbers(12,45);
//        int expected = 57;
//        Assert.assertEquals(expected,result);
//        //actual result
//        //expected result
//    }
//
//
//    // test method of sumAnyNumbers
//    @Test
//    public void sumAnyNumbersTest(){
//        System.out.println("Before all test cases: sumAnyNumbersTest");
//        int result = CalculatorService.sumAnyNumbers(1,3,2);
//        int expected = 6;
//        Assert.assertEquals(expected,result);
//    }
//
//    @AfterClass // After all test Cases
//    public static void cleanup(){
//        System.out.println("After all testcases:  ");
//        System.out.println("End Testcases:  "+new Date());
//    }
//
//    @Before
//    public void beforeEach(){
//        System.out.println("Before each test case:");
//    }
//
//    @After
//    public void afterEach(){
//        System.out.println("After each test case:");
//    }
//
//}
//
////Annotations
///*
//@Test
//@Test(timeout = 2000)
//@BeforeClass
//@AfterClass
//@Before
//@After
//
//
//Assert.assertEquals(expected,result);
//
// */
//
