package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;


public class ReverseStringTest {

    ReverseString obj;
    @Before
    public void setup(){
        System.out.println("Before");
        obj = new ReverseString();
    }

    @After
    public void teardown(){
        System.out.println("After");
        obj = null;
    }

    @BeforeClass
    public static void setupBeforeClass(){
        System.out.println("Beforelass");

    }

    @AfterClass
    public static void teardownAfterClass(){
        System.out.println("AfterClass");

    }

    @Test
    public void  givenStringShouldReturnReverseString(){

        //Arrange

        //Act
        String result =  obj.getReverse("Apple");

        //Assert
        assertEquals("Reversed string is:elppA",result);

    }


}