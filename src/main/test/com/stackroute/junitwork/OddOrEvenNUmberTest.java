package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;

public class OddOrEvenNUmberTest {

    OddOrEvenNUmber obj;
    @Before
    public void setup(){
        System.out.println("Before");
        obj = new OddOrEvenNUmber();
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
    public void  givenNumberShouldReturnJerry (){

        //Arrange

        //Act
        String result =  obj.checkoddeven(24);


        //Assert
        assertEquals("Jerry",result);

    }

    @Test
    public void  givenNumberShouldReturnTom (){

        //Arrange

        //Act
        String result =  obj.checkoddeven(23);


        //Assert
        assertEquals("Tom",result);

    }

    @Test
    public void  givenNumberShouldReturnEvenbutoutofrange (){

        //Arrange

        //Act
        String result =  obj.checkoddeven(46);


        //Assert
        assertEquals("Number is even but doesn't lie between 20-30",result);

    }

    @Test
    public void  givenNumberShouldReturnOddbutoutofrange (){

        //Arrange

        //Act
        String result =  obj.checkoddeven(5);


        //Assert
        assertEquals("Number is odd but doesn't lie between 20-30",result);

    }
}