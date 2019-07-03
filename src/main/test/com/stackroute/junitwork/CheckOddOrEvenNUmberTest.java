package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;

public class CheckOddOrEvenNUmberTest {

    CheckOddOrEvenNUmber obj;
    @Before
    public void setup(){

        obj = new CheckOddOrEvenNUmber();
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
    @Test
    public void  givenNegativeShouldReturnmessage (){

        //Arrange

        //Act
        String result =  obj.checkoddeven( -1);


        //Assert
        assertEquals("Please enter number greater than zero",result);

    }
}