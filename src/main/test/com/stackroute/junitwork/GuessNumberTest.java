package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;


public class GuessNumberTest {

    GuessNumber obj;
    @Before
    public void setup(){

        obj = new GuessNumber();
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
        String result =  obj.matchnumbers(34);


        //Assert
        assertEquals("Number guessed matches the original number",result);

    }
    @Test
    public void  givenNumberShouldReturnFalse (){

        //Arrange

        //Act
        String result =  obj.matchnumbers(23);


        //Assert
        assertEquals("Number guessed is less than original number",result);

    }
    @Test
    public void  givenNumberShouldReturnError (){

        //Arrange

        //Act
        String result =  obj.matchnumbers(53);


        //Assert
        assertEquals("Number guessed is greater than original number",result);

    }

    @Test
    public void  givenNegativeNumberShouldReturnError (){

        //Arrange

        //Act
        String result =  obj.matchnumbers(-3);


        //Assert
        assertEquals("Number guessed is less than original number",result);

    }


}