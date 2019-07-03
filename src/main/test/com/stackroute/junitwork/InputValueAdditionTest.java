package com.stackroute.junitwork;

import org.junit.*;

import java.sql.Array;

import static org.junit.Assert.*;


public class InputValueAdditionTest {

    InputValueAddition obj;
    @Before
    public void setup(){

        obj = new InputValueAddition();
    }

    @After
    public void teardown(){

        obj = null;
    }

    @BeforeClass
    public static void setupBeforeClass(){


    }

    @AfterClass
    public static void teardownAfterClass(){


    }

    @Test
    public void givenNUmberArrayShouldReturnSumOfNumbers()
    {
        int sum =obj.addnumber(new int[]{10,20,30,40});
        assertEquals(100,sum);
    }

    @Test
    public void givenNegativeNUmberArrayShouldReturnSum()
    {
        int sum =obj.addnumber(new int[]{10,-20,30,-40});
        assertEquals(-20,sum);
    }

    @Test
    public void givenemptyArrayShouldReturnerror()
    {
        int sum =obj.addnumber(new int[]{});
        assertEquals(0,sum);
    }

    @Test
    public void givenNUllShouldReturnNUll()
    {
        int sum =obj.addnumber(null);
        assertEquals(0,sum);
    }
}