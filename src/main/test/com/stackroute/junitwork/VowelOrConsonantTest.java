package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;


public class VowelOrConsonantTest {

    VowelOrConsonant obj;
    @Before
    public void setup(){

        obj = new VowelOrConsonant();
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

    @Test
    public void  givenNUllStringShouldReturnError(){

        //Arrange

        //Act
        String result =  obj.countVowelconsonant(null);


        //Assert
        assertEquals(null,result);

    }
}