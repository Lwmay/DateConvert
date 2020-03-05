package main.java.com.start2sparkle.dateconvert.Converters;

import java.text.ParseException;

public class FromCoToFr extends Converter {

    public FromCoToFr(String rawDate) throws Exception {
        try {
            Integer.parseInt(rawDate);

            if (rawDate.length() == 8) {
                String year = rawDate.substring(0, 4);
                this.year = year;
                String month = rawDate.substring(4, 6);
                this.month = month;
                String day = rawDate.substring(6, 8);
                this.day = day;
                setStrDate();
                setRefCo();

            } else {
                throw new Exception("Imput are in wrong format : need 20200526");
            }
        }catch (ParseException e){
            System.out.println("Date wrong format");
        }
    }
}
