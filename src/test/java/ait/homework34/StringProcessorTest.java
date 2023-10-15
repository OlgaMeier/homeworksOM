package ait.homework34;


import de.ait.homework34.StringProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringProcessorTest {

    private StringProcessor stringProcessor;

    @BeforeEach

    public void setUp() {

        stringProcessor = new StringProcessor();
    }

    @Test

    void testConcatenate() {
        String result = stringProcessor.concatenate("Hallo ", "Cohort33E");
        assertEquals("Hallo Cohort33E", result);
    }


        @Test
       void testGetLength() {
            assertEquals(5, stringProcessor.getLength("Hallo"));
        }

       // @Test

      //  void testReverse () {

       //   assertEquals("ollaH", reversed);
       // }

       @Test
   void testIsPalindromeTrue() {
           Assertions.assertTrue(stringProcessor.isPalindrome("ABBA"));

            }
    @Test
    void testIsPalindromeFals() {
        Assertions.assertFalse(stringProcessor.isPalindrome("Hallo Cohort33E"));

    }
    @Test

    void testReverse() {

        assertEquals("ollaH", stringProcessor.reverse("Hallo"));
    }

    }



