package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;


public class CheckInputTypeTest {

    CheckInputType obj;
    @Before
    public void setup(){
        System.out.println("Before");
        obj = new CheckInputType();
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
    public void  givenCharacterShouldReturnCapitalAlphabet(){

        //Arrange

        //Act
        String result =  obj.charCheck('A');

        //Assert
        assertEquals("It is capital letter Alphabet",result);

    }

    @Test
    public void  givenCharacterShouldReturnSmallAlphabet(){

        //Arrange

        //Act
        String result =  obj.charCheck('a');

        //Assert
        assertEquals("It is small letter Alphabet",result);

    }
    @Test
    public void  givenNumberShouldReturnNumber(){

        //Arrange

        //Act
        String result =  obj.charCheck('3');

        //Assert
        assertEquals("It is Number",result);

    }

    @Test
    public void  givenSpecialCharacterShouldReturnNumber(){

        //Arrange

        //Act
        String result =  obj.charCheck('$');

        //Assert
        assertEquals("IT is Special Character",result);

    }
}