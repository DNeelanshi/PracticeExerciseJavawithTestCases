package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;


public class VowelOrConsonantTest {

    VowelOrConsonant obj;
    @Before
    public void setup(){
        System.out.println("Before");
        obj = new VowelOrConsonant();
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
    public void  givenLowerCaseStringShouldReturnConsonantVowel(){

        //Arrange

        //Act
        String result =  obj.countVowelconsonant("apple");


        //Assert
        assertEquals(" vowel,consonant,consonant,consonant,vowel,",result);

    }

    @Test
    public void  givenUpperCaseStringShouldReturnConsonantVowel(){

        //Arrange

        //Act
        String result =  obj.countVowelconsonant("MANGO");


        //Assert
        assertEquals(" consonant,vowel,consonant,consonant,vowel,",result);

    }

    @Test
    public void  givenAllCasesStringShouldReturnConsonantVowel(){

        //Arrange

        //Act
        String result =  obj.countVowelconsonant("PeAr");


        //Assert
        //assertEquals("consonant vowel vowel consonant",result);
        assertEquals(" consonant,vowel,vowel,consonant,",result);

    }

    @Test
    public void  givenNUmberAlphabetStringShouldReturnError(){

        //Arrange

        //Act
        String result =  obj.countVowelconsonant("Pe123RT");


        //Assert
        assertEquals("Error : Please enter only alphabets",result);

    }
    @Test
    public void  givenSpecialCharAlphabetStringShouldReturnError(){

        //Arrange

        //Act
        String result =  obj.countVowelconsonant("Pe@%$RT");


        //Assert
        assertEquals("Error : Please enter only alphabets",result);

    }

}