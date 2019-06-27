package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;

public class PallindromeTest {

    Pallindrome obj;
    @Before
    public void setup(){
        System.out.println("Before");
        obj = new Pallindrome();
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




}