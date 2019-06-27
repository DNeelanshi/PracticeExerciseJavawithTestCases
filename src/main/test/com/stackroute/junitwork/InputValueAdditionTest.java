package com.stackroute.junitwork;

import org.junit.*;

import java.sql.Array;

import static org.junit.Assert.*;


public class InputValueAdditionTest {

    InputValueAddition obj;
    @Before
    public void setup(){
        System.out.println("Before");
        obj = new InputValueAddition();
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
    public void givenNUmberArrayShouldReturnSumOfNumbers()
    {
        int sum =obj.addnumber(new int[]{10,20,30,40});
        assertEquals(100,sum);
    }

}