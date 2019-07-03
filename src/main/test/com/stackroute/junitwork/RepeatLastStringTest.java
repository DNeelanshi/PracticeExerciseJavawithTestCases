package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;


public class RepeatLastStringTest {

    RepeatLastString obj;
    @Before
    public void setup(){
        System.out.println("Before");
        obj = new RepeatLastString();
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
    public void  givenStringNUmberShouldReturnREpeatedStringAsNumber(){

        //Arrange

        //Act
        String result =  obj.repeatlastalphabets("Stackroute",5);

        //Assert
        assertEquals("Stackrouterouterouterouterouteroute",result);

    }

    @Test
    public void  givenStringZeroNUmberShouldReturnSTringNORepeat(){

        //Arrange

        //Act
        String result =  obj.repeatlastalphabets("Stackroute",0);

        //Assert
        assertNotEquals("0",result);

    }

    @Test
    public void  givenNegativeNUmberShouldReturnerror(){

        //Arrange

        //Act
        String result =  obj.repeatlastalphabets("Stackroute",-1);

        //Assert
        assertEquals(null,result);

    }

}