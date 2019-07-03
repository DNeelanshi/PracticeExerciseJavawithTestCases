package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;

public class SortingNumberTest {

    SortingNumber obj;
    @Before
    public void setup(){

        obj = new SortingNumber();
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
    @Test
    public void  givenNegativeShouldReturnFalse (){

        //Arrange

        //Act
        String result =  obj.sum(-56);


        //Assert
        assertNotEquals("True",result);

    }

}