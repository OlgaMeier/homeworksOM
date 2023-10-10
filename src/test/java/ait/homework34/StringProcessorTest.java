package ait.homework34;

import de.ait.homework34.StringProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringProcessorTest {

    private StringProcessor stringProcessor ;
    String str1 ="Hallo";
    String str2 ="Cohort33E";

    @BeforeEach

    public void setUp () {

        stringProcessor= new StringProcessor () ;
    }

    @Test

    public void testConcatenate (String str1, String str2) {

    String stringProcessor;
        stringProcessor = stringProcessor.concat(String str1, String str2);

        assertEquals( "Hallo Cohort33E", StringProcessor.concatenate(str1, str2));


    public void testGetLength() {
        StringProcessor stringProcessor = new StringProcessor();
        int length = stringProcessor.getLength( "Hallo Cohort33E");
        assertEquals(15, length);
    }

        public void testReverse (String str1) {
        String reversed= stringProcessor.reverse("Hallo");
            assertEquals("ollaH", reversed);
        }

    }
    }


