package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;

public class LoopNumberTest {

    LoopNumber obj;
    @Before
    public void setup(){

        obj = new LoopNumber();
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
    @Test
    public void  givenNULLShouldReturnnull(){

        //Arrange

        //Act
        String result =  obj.getpattern(-3);


        //Assert
        assertNotEquals("-3",result);

    }


}