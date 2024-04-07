package com.skode.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AssertionExample {


    @Test
    public void test1(){
        System.out.println("Testing Some assertion methods");
        int actual = 12;
        int expected = 12;
        Assertions.assertEquals(expected,actual);

        int[] actualIntArray = {1,2,3,4,5};
        int[] expectIntArray = {1,2,3,4,5};
        Assertions.assertArrayEquals(expectIntArray,actualIntArray);

//        String name = new String("Rahul");
//        String expectedName = new String("Rahul");
        String name ="Rahul";
        String expectedName = "Rahul";

        Assertions.assertSame(expectedName,name);

        Assertions.assertNotNull(name);
        Assertions.assertTrue(new Boolean("True"));

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
        Assertions.assertIterableEquals(list1,list2);


    }
}
