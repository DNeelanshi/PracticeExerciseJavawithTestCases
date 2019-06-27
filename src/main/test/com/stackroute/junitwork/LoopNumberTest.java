package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;

public class LoopNumberTest {

    LoopNumber obj;
    @Before
    public void setup(){
        System.out.println("Before");
        obj = new LoopNumber();
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
    public void  givenNumberShouldReturnPattern(){

        //Arrange

        //Act
        String result =  obj.getpattern(5);


        //Assert
        assertEquals("122333444455555",result);

    }

    @Test
    public void  givenZeroShouldReturnError(){

        //Arrange

        //Act
        String result =  obj.getpattern(0);


        //Assert
        assertEquals("0",result);

    }



}