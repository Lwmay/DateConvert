package test.java.com.start2sparkle.dateconvert;

import main.java.com.start2sparkle.dateconvert.api.DateConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateConverterTest {

    @Test
    void fromCoToFr() throws Exception {
        String result = DateConverter.fromCoToFr("20200526").toDate();
        assertEquals(result,"26/05/2020");
    }

    @Test
    void fromFrToCo() throws Exception {
        Integer result = DateConverter.fromFrToCo("26/05/2020").toCo();
        assertEquals(result, 20200526);
    }

    @Test
    void fromStringToCo() throws Exception {

        Integer result = DateConverter.from3LettersToCo("26-May-20").toCo();
        assertEquals(result, 20200526);

        result = DateConverter.from3LettersToCo("26-mai-20").toCo();
        assertEquals(result, 20200526);

        result = DateConverter.from3LettersToCo("26May20").toCo();
        assertEquals(result, 20200526);
    }

}
