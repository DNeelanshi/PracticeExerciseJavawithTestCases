package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;

public class PallindromeTest {

    Pallindrome obj;
    @Before
    public void setup(){

        obj = new Pallindrome();
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
    public void  givenNumberShouldReturnPallindromeSumEvenNumbersLessThan25 (){

        //Arrange

        //Act
        String result =  obj.checkpallindrome(1221);


        //Assert
        assertEquals("1221 is pallindrome and sum of even numbers is less than 25",result);

    }

    @Test
    public void  givenNonPallindromeNumberShouldReturnNotPallindrome (){

        //Arrange

        //Act
        String result =  obj.checkpallindrome(19691961);


        //Assert
        assertEquals("19691961 is not pallindrome",result);

    }
    @Test
    public void  givenNumberShouldReturnSumEvenNumbersGreaterthan25(){

        //Arrange

        //Act
        String result =  obj.checkpallindrome(894498);


        //Assert
        assertEquals("894498 is pallindrome and sum of even numbers is less than 25",result);

    }

    @Test
    public void  givenNegativeShouldReturnNull(){

        //Arrange

        //Act
        String result =  obj.checkpallindrome(-6);


        //Assert
        assertEquals("-6 is not pallindrome",result);

    }

    @Test
    public void  givenZeroShouldReturnNull(){

        //Arrange

        //Act
        String result =  obj.checkpallindrome(0);


        //Assert
        assertEquals("0 is pallindrome and sum of even numbers is less than 25",result);

    }

}