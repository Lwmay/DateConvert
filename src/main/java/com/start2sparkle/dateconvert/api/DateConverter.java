package main.java.com.start2sparkle.dateconvert.api;

import main.java.com.start2sparkle.dateconvert.Converters.FromString;
import main.java.com.start2sparkle.dateconvert.Converters.FromCoToFr;
import main.java.com.start2sparkle.dateconvert.Converters.FromFrToCo;

public class DateConverter {

    public static FromCoToFr fromCoToFr(String rawDate) throws Exception { return new FromCoToFr(rawDate);}
    public static FromFrToCo fromFrToCo(String rawDate) throws Exception { return new FromFrToCo(rawDate);}
    public static FromString from3LettersToCo(String rawData) throws Exception { return new FromString(rawData);}

}
