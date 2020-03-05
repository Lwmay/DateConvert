package main.java.com.start2sparkle.dateconvert.Converters;

import java.text.ParseException;
import java.util.HashMap;

public class FromString extends Converter{

    private static HashMap map = new HashMap<>();

    static{
        map.put("janv", "01");
        map.put("févr", "02");
        map.put("Feb", "02");
        map.put("mars", "03");
        map.put("avr", "04");
        map.put("Apr", "04");
        map.put("mai", "05");
        map.put("May", "05");
        map.put("juin", "06");
        map.put("juil", "07");
        map.put("août", "08");
        map.put("Aug", "08");
        map.put("sept", "09");
        map.put("oct", "10");
        map.put("nov", "11");
        map.put("déc", "12");
        map.put("Dec", "12");
    }

    private String[] parts;

    public FromString(String rawData){

        try {
            if (rawData.length() > 7) {
                parts = rawData.split("-");
                this.day = parts[0];
                this.month = (String) map.get(parts[1]);
                this.year = "20" + parts[2];
            } else {
                this.day = rawData.substring(0, 2);
                this.month = (String) map.get(rawData.substring(2, 5));
                this.year = "20" + rawData.substring(5, 7);
            }
        }catch (Exception e) {
            System.out.println("Date wrong format");
        }
    }


}
