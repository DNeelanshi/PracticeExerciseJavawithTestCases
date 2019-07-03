package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;


public class ReverseStringTest {

    ReverseString obj;
    @Before
    public void setup(){

        obj = new ReverseString();
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
    public void  givenStringShouldReturnReverseString(){

        //Arrange

        //Act
        String result =  obj.getReverse("Apple");

        //Assert
        assertEquals("Reversed string is:elppA",result);

    }

    @Test
    public void  givenNUmberShouldReturnReverseString(){

        //Arrange

        //Act
        String result =  obj.getReverse("345638");

        //Assert
        assertNotEquals("Reversed string is:836453",result);

    }

    @Test
    public void  givenAlphaNUmberShouldReturnReverseString(){

        //Arrange

        //Act
        String result =  obj.getReverse("345retdu638");

        //Assert
        assertEquals("Reversed string is:836udter543",result);

    }

    @Test
    public void  givenNullShouldReturnReverseString(){

        //Arrange

        //Act
        String result =  obj.getReverse(null);

        //Assert
        assertEquals(null,result);

    }

}