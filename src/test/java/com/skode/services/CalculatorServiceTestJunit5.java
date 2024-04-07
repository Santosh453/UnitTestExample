package com.skode.services;

import org.junit.jupiter.api.*;

public class CalculatorServiceTestJunit5 {


//    Execute Logic before the all test cases


    @BeforeAll
    public static void init(){
        System.out.println("This is single time logic");
    }

    @AfterAll
    public static void cleanup(){
        System.out.println("This is single time logic Cleanup");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("This is single time logic beforeEach");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("This is single time logic afterEach");
    }


    @Test
    @DisplayName("This Custom Name")
    public void addTwoNumbersTest(){
        System.out.println("First Test Case");
        int actualResult = CalculatorService.addTwoNumbers(5,6);
        int expectedResult = 11;
        Assertions.assertEquals(expectedResult,actualResult,"Test Fail !!");
    }

    @Test
    @Disabled
    public void sumAnyNumbersTest(){
        System.out.println("Second Test Case");
        int actualResult = CalculatorService.sumAnyNumbers(5,6,4);
        int expectedResult = 15;
        Assertions.assertEquals(expectedResult,actualResult,"Test Fail !!");
    }
}
