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
        assertEquals("Stackroute",result);

    }

}