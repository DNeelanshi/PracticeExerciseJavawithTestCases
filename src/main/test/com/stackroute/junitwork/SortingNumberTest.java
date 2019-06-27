package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;

public class SortingNumberTest {

    SortingNumber obj;
    @Before
    public void setup(){
        System.out.println("Before");
        obj = new SortingNumber();
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
    public void  givenNumberShouldReturnTrue (){

        //Arrange

        //Act
        String result =  obj.sum(98765789);


        //Assert
        assertEquals("True",result);

    }

    @Test
    public void  givenNumberShouldReturnFalse (){

        //Arrange

        //Act
        String result =  obj.sum(23415);


        //Assert
        assertEquals("False",result);

    }


}