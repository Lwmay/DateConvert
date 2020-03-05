package main.java.com.start2sparkle.dateconvert.Converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FromFrToCo extends Converter {

    private SimpleDateFormat frDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public FromFrToCo(String rawDate)throws Exception {
        String[] parts;
        try{
            frDateFormat.parse(rawDate);
            parts = rawDate.split("/");
            this.day = parts[0];
            this.month = parts[1];
            this.year = parts[2];
            setRefCo();
            setStrDate();

        }catch (ParseException e){
            System.out.println("Date wrong format : need 26/05/2020");
        }
    }
}
